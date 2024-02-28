package RegularPolygon;

public class test {
    public static void main(String[] args) {
        RegularPolygon f1 = new RegularPolygon();
        RegularPolygon f2 = new RegularPolygon(6, 4);
        RegularPolygon f3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Polygon 1 perimeter:" + f1.getPerimeter());
        System.out.println("Polygon 1 area:" + f1.getArea());
        System.out.println("Polygon 2 perimeter:" + f2.getPerimeter());
        System.out.println("Polygon 2 area:" + f2.getArea());
        System.out.println("Polygon 3 perimeter:" + f3.getPerimeter());
        System.out.println("Polygon 3 area:" + f3.getArea());

    }
}
