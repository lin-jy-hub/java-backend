package Time;

public class test {
    public static void main(String[] args) {
        Time a = new Time();
        Time b = new Time(555550000);
        System.out.println("Hour: " + a.getHour() + " Minute: " + a.getMinute() + " Second: " + a.getSecond());
        System.out.println("Hour: " + b.getHour() + " Minute: " + b.getMinute() + " Second: " + b.getSecond());
    }
}
