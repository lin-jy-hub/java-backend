package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println("Multiplication is " + (a + b));
                return;
            } catch (InputMismatchException ex) {
                in.nextLine();
                System.out.print("Incorrect input and re-enter two integers: ");
            }
        }
    }
}
