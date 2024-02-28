package Lab26;

public class Test1 {
    public static void main(String[] args) {
        GeometricObject o1 = new Circle(5);
        GeometricObject o2 = new Rectangle(3, 4);

        GeometricObject o3 = new Rectangle(5, 6);
        GeometricObject o4 = new Circle(2);

        System.out.println("the max of o1 and o2 is: " + GeometricObject.max(o1, o2));
        System.out.println("the max of o3 and o4 is: " + GeometricObject.max(o3, o4));

    }
}
