package Factory.Factory2;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        var shape1 = factory.getShape("rectangle");
        shape1.draw();

        var shape2 = factory.getShape("circle");
        shape2.draw();

        var shape3 = factory.getShape("square");
        shape3.draw();
    }
}
