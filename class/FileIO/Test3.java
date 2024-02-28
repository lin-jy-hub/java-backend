package FileIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        try {
            PrintWriter pw = new PrintWriter(new File("Exercise1215.txt"));
            for (int i = 1; i <= 10; ++i) {
                for (int j = 1; j <= 10; ++j) {
                    pw.print(rnd.nextInt() + " ");
                }
                pw.println();
            }
            pw.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Scanner in = new Scanner(new File("Exercise1215.txt"));
            ArrayList<Integer> a = new ArrayList<>();
            while (in.hasNextInt())
                a.add(in.nextInt());
            Collections.sort(a);
            for (int i = 0; i < a.size(); ++i) {
                System.out.print(a.get(i) + " ");
                if((i + 1) % 10 == 0) System.out.println();
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
