package Structural.Flyweight.Problem;

public class Client {
    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints())
            point.draw();
    }
}
