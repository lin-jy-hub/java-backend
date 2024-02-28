package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;
    final long secondMSecond = 1000;
    final long minuteMSecond = 60 * secondMSecond;
    final long hourMSecond = 60 * minuteMSecond;
    final long dayMSecond = 24 * hourMSecond;
    Time() {
        this(System.currentTimeMillis());
    }
    Time(long t) {
        setTime(t);
    }
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    void setTime(long t) {
        t %= dayMSecond;
        this.hour = (int)(t / hourMSecond);
        t %= hourMSecond;
        this.minute = (int)(t / minuteMSecond);
        t %= minuteMSecond;
        this.second = (int)(t / secondMSecond);
    }
    int getHour() {
        return hour;
    }
    int getMinute() {
        return minute;
    }
    int getSecond() {
        return second;
    }
}
