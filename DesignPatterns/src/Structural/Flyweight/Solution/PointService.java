package Structural.Flyweight.Solution;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point1 = new Point(1,
                2,
                iconFactory.getPointIcon(PointType.CAFE));
        var point2 = new Point(10,
                20,
                iconFactory.getPointIcon(PointType.CAFE));
        var point3 = new Point(11,
                20,
                iconFactory.getPointIcon(PointType.HOSPITAL));
        var point4 = new Point(12,
                21,
                iconFactory.getPointIcon(PointType.RESTAURANT));

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        return points;
    }
}
