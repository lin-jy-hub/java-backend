package test;
import java.math.BigInteger;

public class Mersenne素数 {
    public static void main(String[] args) {
        BigInteger k = BigInteger.valueOf(1);
        for(int i = 1; i <= 1000; ++i) {
            k = k.multiply(BigInteger.valueOf(2));
            if(k.subtract(BigInteger.valueOf(1)).isProbablePrime(3)) System.out.println(k.subtract(BigInteger.valueOf(1)));
        }
    }
}
