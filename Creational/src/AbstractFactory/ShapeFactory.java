package AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String colorName) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}
