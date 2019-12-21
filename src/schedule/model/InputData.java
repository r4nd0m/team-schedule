package schedule.model;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import javax.json.JsonObject;

public class InputData {
    private String league;
    private String season;
    private LocalDate start;
    private LocalDate end;
    private List<Team> teams;

    public InputData(final JsonObject json) {
        league = json.getString("league");
        season = json.getString("season");
        start = LocalDate.parse(json.getString("start"));
        end = LocalDate.parse(json.getString("end"));
        teams = json.getJsonArray("teams").stream().map(x -> new Team(x.asJsonObject().getString("name"))).collect(Collectors.toList());
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(final String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(final String season) {
        this.season = season;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(final LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(final LocalDate end) {
        this.end = end;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(final List<Team> teams) {
        this.teams = teams;
    }

    @Override public String toString() {
        return "InputData {" + "league=" + league + ", season=" + season + ", start=" + start + ", end=" + end + ", teams=" + teams + "}";
    }
}
