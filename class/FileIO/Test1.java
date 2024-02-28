package FileIO;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1 {
    public static void main(String[] args) {
        try {
            File file = new File("class\\FileIO\\Loan.java");
            Scanner in = new Scanner(file);
            long cha = file.length();
            int word = 0;
            int line = 0;
            while (in.hasNext()) {
                word += new StringTokenizer(in.nextLine()).countTokens();
                line++;
            }
            in.close();
            System.out.println("File Loan.java has");
            System.out.println(cha + " characters");
            System.out.println(word + " words");
            System.out.println(line + " lines");
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}