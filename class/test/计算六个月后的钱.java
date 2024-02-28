package test;
import java.util.Scanner;

public class 计算六个月后的钱 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter monthly saving amount: ");
        double money = in.nextInt();
        double k = 0.05 / 12 + 1;
        double ans = 0;

        for(int i = 1; i <= 6; ++i) ans = ans * k + money;

        System.out.println("After the sixth month, the account value is " + ans);

        in.close();
    }
}