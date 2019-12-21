package schedule.model;

public class Team {
    private String name;

    Team(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Team {" + "name=" + name + "}";
    }

    @Override public boolean equals(Object otherTeam) {
        if (this == otherTeam) {
            return true;
        }

        if (otherTeam == null || getClass() != otherTeam.getClass()) {
            return false;
        }

        return name.equals(((Team) otherTeam).getName());
    }
}
