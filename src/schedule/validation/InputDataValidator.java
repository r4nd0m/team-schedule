package schedule.validation;

import schedule.model.Pair;
import schedule.model.InputData;
import schedule.model.Team;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class InputDataValidator {
    public static Pair<Boolean, List<String>> validate(final InputData inputData) {
        final List<String> messages = new LinkedList<>();

        messages.addAll(validateDates(inputData.getStart(), inputData.getEnd()));
        messages.addAll(validateTeams(inputData.getTeams()));

        final Boolean isValid = messages.size() == 0;

        return new Pair<>(isValid, messages);
    }

    private static List<String> validateDates(final LocalDate start, final LocalDate end) {
        List<String> messages = new LinkedList<>();

        if (start == null) {
            messages.add("Start date is not specified");
        }

        if (end == null) {
            messages.add("End date is not specified");
        }

        if (start != null && end != null) {
            if (end.isBefore(start)) {
                messages.add("End date is before start date");
            } else {
                boolean isAtLeastOneGameDayFound = false;
                for (LocalDate currentDate = start; !currentDate.isAfter(end); currentDate = currentDate.plusDays(1)) {
                    if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                        isAtLeastOneGameDayFound = true;
                    }
                }

                if (!isAtLeastOneGameDayFound) {
                    messages.add("No game days found between specified dates");
                }
            }
        }

        return messages;
    }

    private static List<String> validateTeams(final List<Team> teams) {
        List<String> messages = new LinkedList<>();

        if (teams == null) {
            messages.add("Teams are not specified");
        } else if (teams.size() == 0) {
            messages.add("Teams are not specified");
        } else if (teams.size() < 2) {
            messages.add("Only one team is specified");
        } else {
            final List<String> possibleDuplicates = teams.stream().filter(team -> Collections.frequency(teams, team) > 1).map(Team::getName).distinct()
                    .collect(Collectors.toList());

            if (possibleDuplicates.size() > 0) {
                messages.add("Found duplicated team(s): " + String.join(", ", possibleDuplicates));
            }
        }

        return messages;
    }
}
