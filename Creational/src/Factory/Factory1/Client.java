package Factory.Factory1;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new SquareFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new CircleFactory().getShape();
        shape3.draw();
    }
}
