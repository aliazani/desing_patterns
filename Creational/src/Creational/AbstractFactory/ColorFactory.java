package Creational.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String colorType) {
        if (colorType.equalsIgnoreCase("red"))
            return new Red();
        else if (colorType.equalsIgnoreCase("blue"))
            return new Blue();
        else if (colorType.equalsIgnoreCase("green"))
            return new Green();
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
