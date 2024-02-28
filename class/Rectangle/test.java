package Rectangle;

public class test {
    public static void main(String[] args) {
        Rectangle T = new Rectangle(4, 40);
        Rectangle Q = new Rectangle(3.5, 35.9);
        System.out.println("The area of a rectangle with 4.0 and height 40.0 is " + T.getArea());
        System.out.println("The perimeter of a rectangle is " + T.getPerimeter());
        System.out.println("The area of a rectangle with 3.5 and height 35.9 is " + Q.getArea());
        System.out.println("The perimeter of a rectangle is " + Q.getPerimeter());


    }
}
