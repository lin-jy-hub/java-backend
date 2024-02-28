package test;
import java.util.Random;

public class 随机100内的五十个数 {

    public static void main(String[] args) {

        Random R = new Random(1000);
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= 10; ++j) {
                System.out.print(R.nextInt(100) + " ");
            }
            System.out.println();
        }
    }

}