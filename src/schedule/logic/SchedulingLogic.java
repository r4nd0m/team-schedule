package schedule.logic;

import schedule.model.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class SchedulingLogic {
    public static Schedule createSchedule(final InputData inputData) {
        final Deque<Game> gamesPool = generateGamesPool(inputData.getTeams());
        Collections.shuffle((List<?>) gamesPool);

        final int maxGamesPerDay = inputData.getTeams().size() / 2;

        final List<LocalDate> gameDatesPool = generateGameDates(inputData.getStart(), inputData.getEnd());
        final List<LocalDate> firstRoundGameDatesPool = gameDatesPool.subList(0, gameDatesPool.size()/2);
        final List<LocalDate> secondRoundGameDatesPool = gameDatesPool.subList(gameDatesPool.size()/2, gameDatesPool.size());

        final List<GameDay> firstRound = generateRound(gamesPool, firstRoundGameDatesPool, maxGamesPerDay);
        final List<GameDay> secondRound = generateRound(gamesPool, secondRoundGameDatesPool, maxGamesPerDay);

        return new Schedule(firstRound, secondRound);
    }

    private static List<LocalDate> generateGameDates(LocalDate start, LocalDate end) {
        final List<LocalDate> gameDates = new LinkedList<>();

        for (LocalDate currentDate = start; !currentDate.isAfter(end); currentDate = currentDate.plusDays(1)) {
            if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                gameDates.add(currentDate);
            }
        }

        return gameDates;
    }

    private static LinkedList<Game> generateGamesPool(List<Team> teams) {
        final LinkedList<Game> gamesPool = new LinkedList<>();

        teams.forEach(hostTeam ->
            teams.forEach(
                guestTeam -> {
                    if(!hostTeam.equals(guestTeam)) {
                        gamesPool.add(new Game(hostTeam, guestTeam));
                    }
                }
            )
        );

        return gamesPool;
    }

    private static boolean isAlreadyAllocatedInRound(Team team1, Team team2, List<Game> games) {
        Game game = games.stream()
                .filter(
                        tmpGame ->
                                tmpGame.getHost().equals(team1) && tmpGame.getGuest().equals(team2) ||
                                tmpGame.getHost().equals(team2) && tmpGame.getGuest().equals(team1)
                )
                .findAny()
                .orElse(null);

        return game != null;
    }

    private static boolean isAnyOfTeamsInvolved(Team team1, Team team2, List<Game> games) {
        Game game = games.stream()
                .filter(
                        tmpGame ->
                                tmpGame.getHost().equals(team1) ||
                                        tmpGame.getGuest().equals(team2) ||
                                        tmpGame.getHost().equals(team2) ||
                                        tmpGame.getGuest().equals(team1)
                )
                .findAny()
                .orElse(null);

        return game != null;
    }

    private static Game getNextGame(Deque<Game> gamesPool, List<Game> allocatedRoundGames, List<Game> thisDayGames) {
        return gamesPool.stream()
                .filter(tmpGame -> !isAlreadyAllocatedInRound(tmpGame.getHost(), tmpGame.getGuest(), allocatedRoundGames))
                .filter(tmpGame -> !isAnyOfTeamsInvolved(tmpGame.getHost(), tmpGame.getGuest(), thisDayGames))
                .findAny()
                .orElse(null);
    }

    private static List<GameDay> generateRound(Deque<Game> gamesPool, List<LocalDate> datesPool, int maxGamesPerDay) {
        final List<GameDay> round = new ArrayList<>();
        final List<Game> roundGames = new ArrayList<>();

        datesPool.forEach(date -> {
            final List<Game> thisDayGames = new ArrayList<>();

            for (int i=0; i< maxGamesPerDay; i++) {
                Game game  = getNextGame(gamesPool, roundGames, thisDayGames);

                if (game != null) {
                    thisDayGames.add(game);
                    roundGames.add(game);
                    gamesPool.remove(game);
                }
            }

            round.add(new GameDay(date, thisDayGames));
        });

        return round;
    }
}
