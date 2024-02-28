package test;
import java.util.*;

public class 获取当前日期 {

    public static void main(String[] args) {

        GregorianCalendar DATE = new GregorianCalendar();
        System.out.println("Year is " + DATE.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + (DATE.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Date is " + DATE.get(GregorianCalendar.DAY_OF_MONTH));

        DATE.setTimeInMillis(1234567898765L);

        System.out.println("Year is " + DATE.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + (DATE.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Date is " + DATE.get(GregorianCalendar.DAY_OF_MONTH));
    }

}