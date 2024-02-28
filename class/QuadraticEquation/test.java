package QuadraticEquation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.print("Enter a, b, c:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        QuadraticEquation T = new QuadraticEquation(a, b, c);
        int flag = T.getDiscriminant();
        if(flag > 0) {
            System.out.println("The root is " + T.getRoot1() + " and " + T.getRoot2());
        }else if(flag == 0){
            System.out.println("The root is " + T.getRoot1());
        }else {
            System.out.println("The equation has no root");
        }
        in.close();

    }
}
