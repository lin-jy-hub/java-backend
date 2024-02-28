package Triangle;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print("Enter the color: ");
        String color = in.next();
        System.out.print("Enter boolean value for filled: ");
        Boolean filled = in.nextBoolean();
        Triangle triangle = new Triangle(a, b, c);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println(triangle.toString());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("Is filled? " + triangle.isFilled());
        in.close();
    }
}
