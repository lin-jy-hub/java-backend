package StopWatch;
import java.util.*;

public class test {
    public static void main(String[] args) {
        final int N = 100000;
        Random R = new Random();
        int []a = new int[N];
        for(int i = 0; i < N; ++i) a[i] = R.nextInt();
        StopWatch time = new StopWatch();
        Arrays.sort(a);
        time.stop();
        System.out.println("The sort time is " + time.getElapsedTime());


    }
}
