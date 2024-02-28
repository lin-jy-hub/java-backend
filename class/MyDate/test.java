package MyDate;

public class test {
    public static void main(String[] args) {
        MyDate t1 = new MyDate();
        MyDate t2 = new MyDate(34355555133101L);
        System.out.println("The current time is:");
        System.out.println(t1);
        System.out.println(34355555133101L + "millisecond is:");
        System.out.println(t2);
    }
}
