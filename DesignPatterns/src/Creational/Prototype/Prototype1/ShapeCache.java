package Creational.Prototype.Prototype1;

import java.util.Hashtable;
// Register design pattern
public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
