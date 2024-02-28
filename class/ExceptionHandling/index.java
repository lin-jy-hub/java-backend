package ExceptionHandling;

import java.util.Random;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int[] a = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < 100; ++i)
            a[i] = rnd.nextInt();
        System.out.print("Enter an index: ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        in.close();
        try {
            System.out.println("The element is " + a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
    }
}
