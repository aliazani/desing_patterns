package Creational.Factory.Factory3;

public class Client {
    public static void main(String[] args) {
        var shape1 = ShapeFactory.getShape("circle");
        shape1.draw();
        var shape2 = ShapeFactory.getShape("square");
        shape2.draw();
        var shape3 = ShapeFactory.getShape("rectangle");
        shape3.draw();
    }
}
