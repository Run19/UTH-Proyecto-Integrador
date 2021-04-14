package Time;

import static Util.Util.twoDigits;

public class Hour {

    private int minute;
    private int hour;

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Hour(int minute, int hour) {
        this.minute = minute;
        this.hour = hour;
    }

    public String showHour() {
        return "%s:%s".formatted(twoDigits(hour), twoDigits(minute));
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
}
