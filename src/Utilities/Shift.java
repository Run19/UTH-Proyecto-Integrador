package Utilities;

import Time.Hour;

public enum Shift {
    morning("Matutino", new Hour(0, 7), new Hour(0, 14)),
    afteernoon("Vespertino", new Hour(0, 14), new Hour(0, 20)),
    night("Nocturno", new Hour(0, 20), new Hour(30, 2));


    Shift(String name, Hour joinHour, Hour exitHour) {
        this.name = name;
        this.joinHour = joinHour;
        this.exitHour = exitHour;
    }

    private String name;
    private Hour joinHour;
    private Hour exitHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hour getJoinHour() {
        return joinHour;
    }

    public void setJoinHour(Hour joinHour) {
        this.joinHour = joinHour;
    }

    public Hour getExitHour() {
        return exitHour;
    }

    public void setExitHour(Hour exitHour) {
        this.exitHour = exitHour;
    }
}
