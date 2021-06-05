package Structural.Flyweight.Problem;

public class Point {
    // Use this pattern in applications, we have a large number of object and this objects take a significant amount of memory
    // -> reduce the amount of memory consumed by these objects
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
