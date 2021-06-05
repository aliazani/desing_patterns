package Structural.Flyweight.Solution;

public class Point {
    // Use this pattern in applications, we have a large number of object and this objects take a significant amount of memory
    // -> reduce the amount of memory consumed by these objects
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
