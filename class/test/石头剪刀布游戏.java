package test;
import java.util.Scanner;

public class 石头剪刀布游戏 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");
        String p[] = new String[3];
        p[0] = "scissor"; p[1] = "rock"; p[2] = "paper";
        int person = in.nextInt();
        int computer = (int)(Math.random() * 3);
        if(person == computer) {
            System.out.println("The computer is " + p[computer] + ". You are " + p[person] + " too. It is a draw");
        } else if((person == 2 && computer == 1) || (person == 3 && computer == 2) || (person == 0 && computer == 3)) {
            System.out.println("The computer is " + p[computer] + ". You are " + p[person] + ". You lost");
        }else {
            System.out.println("The computer is " + p[computer] + ". You are " + p[person] + ". You won");
        }
        in.close();
    }
}