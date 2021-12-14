package polyline;
import java.util.*;
public class TestPolyline {
    public static void main(String[] args) {
        Polyline l1 = new Polyline();
        System.out.println(l1);
        l1.appendPoint(new Point(1, 2));
        l1.appendPoint(3, 4);
        l1.appendPoint(5, 6);
        System.out.println(l1);
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(11,12));
        points.add(new Point(13,14));
        Polyline l2 = new Polyline(points);
        System.out.println(l2);
    }
}
