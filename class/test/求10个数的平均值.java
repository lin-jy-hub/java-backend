package test;
import java.util.Scanner;

public class 求10个数的平均值 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 10 double values: ");
        double []a = new double[10];
        for(int i = 0; i < 10; ++i) a[i] = in.nextDouble();
        System.out.println(average(a));
        in.close();
    }
    public static double average(double []a) {
        double sum = 0;
        for(int i = 0; i < 10; ++i) sum += a[i];
        return sum / 10;
    }
}