package GeometricObject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input triangle's color:");
        String color = in.next();
        System.out.println("please input triangle's three sides:");
        int[] d = { in.nextInt(), in.nextInt(), in.nextInt() };
        System.out.println("Is the triangle filled?true or false?");
        boolean fill = in.nextBoolean();
        in.close();
        Triangle t = new Triangle(d[0], d[1], d[2]);
        t.setColor(color);
        t.setFilled(fill);
        System.out.println(t.toString());

    }
}
