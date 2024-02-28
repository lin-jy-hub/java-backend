package test;

import java.util.ArrayList;
import java.util.Scanner;

public class MinOfArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        ArrayList<Integer> list = new ArrayList<>();
        int x = in.nextInt();
        while (x != 0) {
            list.add(x);
            x = in.nextInt();
        }
        in.close();
        System.out.println("The minimun number is " + min(list));
    }

    public static Integer min(ArrayList<Integer> list) {
        if (list.isEmpty() || list == null) return null;
        Integer mn = list.get(0);
        for (int i = 1; i < list.size(); ++i) mn = Math.min(mn, list.get(i));
        return mn;
    }
}