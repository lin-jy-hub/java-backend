package MyPoint;

public class MyPoint {
    private double x;
    private double y;
    MyPoint() {
        x = 0;
        y = 0;
    }
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(MyPoint a, MyPoint b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
    public double distance(double xx, double yy) {
        return Math.sqrt((xx - x) * (xx - x) + (yy - y) * (yy - y));
    }
    public double distance(MyPoint k) {
        return distance(k.x, k.y);
    }
}
