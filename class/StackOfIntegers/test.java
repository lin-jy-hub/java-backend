package StackOfIntegers;

import java.util.Scanner;
import java.util.Vector;

public class test {
    public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int copy_n = n;
    in.close();
    final int max = (int)1e6;
    boolean []vis = new boolean[max];
    Vector<Integer> prime = new Vector<>();
    StackOfIntegers s = new StackOfIntegers();
    for(int i = 2; i < max; ++i) {
      if(vis[i]) continue;
      prime.add(i);
      for(int j = i; j < max; j += i) vis[j] = true;
    }
    for(int i = 0; i < prime.size(); ++i) {
      if(prime.get(i) > n) break;
      while(n % prime.get(i) == 0) {
        s.push(prime.get(i));
        n /= prime.get(i);
      }
    }
    System.out.println("The factor for " + copy_n + " is");
    while(!s.empty()) System.out.print(s.pop() + " ");
  }
}
