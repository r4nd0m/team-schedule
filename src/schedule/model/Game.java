package schedule.model;

public class Game {
    private Team host;
    private Team guest;

    public Game(final Team host, final Team guest) {
        this.host = host;
        this.guest = guest;
    }

    public void setHost(final Team host) {
        this.host = host;
    }

    public Team getHost() {
        return host;
    }

    public void setGuest(final Team guest) {
        this.guest = guest;
    }

    public Team getGuest() {
        return guest;
    }

    @Override public String toString() {
        return "Game {host=" + host + ", guest=" + guest + "}";
    }
}
