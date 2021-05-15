package Creational.Factory.Factory1;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
