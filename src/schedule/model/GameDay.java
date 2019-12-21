package schedule.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GameDay {
    private LocalDate date;
    private List<Game> games;

    public GameDay(final LocalDate date, final List<Game> games) {
        this.date = date;
        this.games = games;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(final List<Game> games) {
        this.games = games;
    }

    @Override public String toString() {
        return "GameDay {" + "date=" + date + ", games=" + games + "}";
    }
}
