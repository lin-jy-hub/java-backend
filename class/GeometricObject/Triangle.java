package GeometricObject;

import java.util.Arrays;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        double[] a = { side1, side2, side3 };
        Arrays.sort(a);
        if (a[0] + a[1] < a[2])
            return "The three sides can not build a triangle";
        return "The triangle's area is " + getArea() + "\nThe triangle's perimeter is " + getPerimeter()
                + "\nThe triangle's color is " + getColor() + "\n Is the triangle filled? " + isFilled();
    }

    
}
