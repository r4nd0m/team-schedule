package schedule.model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Schedule {
    private List<GameDay> firstRound = new ArrayList<>();
    private List<GameDay> secondRound = new ArrayList<>();

    public Schedule() {}

    public Schedule(final List<GameDay> firstRound, final List<GameDay> secondRound) {
        this.firstRound = firstRound;
        this.secondRound = secondRound;
    }

    public List<GameDay> getFirstRound() {
        return firstRound;
    }

    public void setFirstRound(final List<GameDay> firstRound) {
        this.firstRound = firstRound;
    }

    public List<GameDay> getSecondRound() {
        return secondRound;
    }

    public void setSecondRound(final List<GameDay> secondRound) {
        this.secondRound = secondRound;
    }

    @Override public String toString() {
        return "Schedule {" + "firstRound=" + firstRound + ", secondRound=" + secondRound + "}";
    }

    public String toOutputString() {
        return "First round:\n" + roundToOutputString(firstRound) + "\nSecond round:\n" + roundToOutputString(secondRound);
    }

    private String roundToOutputString(List<GameDay> round) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd.MM.yyyy", Locale.GERMANY);

        return round.stream()
        .filter(gameDay -> gameDay.getGames().size() > 0)
        .map(
            gameDay -> gameDay.getGames().stream()
                .map(game -> gameDay.getDate().format(formatter) + " | " + game.getHost().getName() + " - " + game.getGuest().getName())
                .collect(Collectors.joining("\n"))
        )
        .collect(Collectors.joining("\n"));
    }
}
