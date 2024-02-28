package test;
public class 随机生成100个数 {
    public static void main(String[] args) {
        int []counts = new int[10];
        System.out.println("The digit are: ");
        for(int i = 1; i <= 100; ++i) {
            int k = (int) (Math.random() * 10);
            System.out.print(k + " ");
            counts[k]++;
            if(i % 10 == 0) System.out.println();
        }
        System.out.println("The occurrences of each digit are:");
        for(int i = 0; i < 10; ++i) {
            System.out.println(i + " occurrence times is: " + counts[i]);
        }
    }
}