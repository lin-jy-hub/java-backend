package PrintCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the year:");
        int year = in.nextInt();
        System.out.println("Please input the month:");
        int month = in.nextInt() - 1;
        in.close();
        Calendar a = new GregorianCalendar(year, month, 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int m = a.get(Calendar.DATE);
        a.roll(Calendar.DATE, 1);
        int n = a.get(Calendar.DAY_OF_WEEK);
        final String[] s = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        System.out.println("          " + s[month] + ", " + year);
        System.out.println("---------------------------------------------------");
        System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");
        int i = 1;
        while (i++ < n) System.out.print("\t");
        for (i = 1; i <= m; i++) {
            if ((n - 1 + i) % 7 == 0) System.out.println(i + "\t");
            else System.out.print(i + "\t");
        }
    }
}
