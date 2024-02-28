package test;
import java.util.*;

public class 使用data类 {

    public static void main(String[] args) {

        long T = 10000;
        Date time = new Date(T);
        while(T <= 100000000000L) {
            time.setTime(T);
            System.out.println(time.toString());
            T *= 10;
        }

    }

}