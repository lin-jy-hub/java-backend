package FileIO;

import java.net.URL;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new URL("https://www.baidu.com/robots.txt").openStream());
            int ans = 0;
            while (in.hasNextLine()) ans += new StringTokenizer(in.nextLine()).countTokens();
            System.out.println("The number of words is " + ans);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
