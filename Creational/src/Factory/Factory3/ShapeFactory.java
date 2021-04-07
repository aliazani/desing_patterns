package Factory.Factory3;

import Factory.Factory3.Circle;
import Factory.Factory3.Rectangle;
import Factory.Factory3.Square;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }

}
