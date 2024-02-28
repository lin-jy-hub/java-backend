package test;
import java.math.BigDecimal;

public class e {
    public static void main(String[] args) {
        BigDecimal k = new BigDecimal(1);
        BigDecimal mid = new BigDecimal(1);
        for(int i = 1; i <= 1000; ++i) {
            mid = mid.multiply(BigDecimal.valueOf(i));
            //k = k.add(BigDecimal.valueOf(1).divide(mid, 25, BigDecimal.ROUND_CEILING));
            if(i % 100 == 0) System.out.println("The e is " + k + " for i = " + i);
        }
    }
}