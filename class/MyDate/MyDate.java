package MyDate;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar T;

    MyDate() {
        T = new GregorianCalendar();
        setDate(T.getTimeInMillis());
    }

    MyDate(long t) {
        this();
        setDate(t);
    }

    public void setDate(long k) {
        T.setTimeInMillis(k);
        year = T.get(Calendar.YEAR);
        month = T.get(Calendar.MONTH);
        day = T.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return "year: " + year + "\n" + "month: " + month + "\n" + "day: " + day;
    }
}
