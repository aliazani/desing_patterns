package Structural.Flyweight.Problem;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointType type; // 4 bytes
    private byte[] icon; // 20KB

    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", type, x, y);
    }
}
