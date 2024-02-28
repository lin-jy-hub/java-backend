package ArrayList;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(new Loan());
        a.add(new Date());
        a.add(new String("hello"));
        a.add(new Circle());
        for(int i = 0; i < a.size(); ++i) {
            System.out.println(a.get(i).toString());
        }
    }
}
