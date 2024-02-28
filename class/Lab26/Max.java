package Lab26;

public class Max {
    public static ComparableCircle max(ComparableCircle a, ComparableCircle b) {
        if (a.compareTo(b) == 1)
            return a;
        return b;
    }
}
