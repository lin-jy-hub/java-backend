package Lab26;

public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        double s = getArea();
        double os = o.getArea();
        if (s > os)
            return 1;
        else if (s < os)
            return -1;
        return 0;
    }
}
