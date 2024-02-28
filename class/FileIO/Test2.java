package FileIO;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("class\\FileIO\\testdata.txt"));
            double sum = 0;
            int num = 0;
            while (in.hasNextDouble()) {
                sum += in.nextDouble();
                num++;
            }
            System.out.println("Total is " + sum);
            System.out.println("Average is " + sum / num);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
