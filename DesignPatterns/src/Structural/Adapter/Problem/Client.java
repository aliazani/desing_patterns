package Structural.Adapter.Problem;

public class Client {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        // The problem is blow:
        // imageView.apply(new Caramel());
        // Composition
        // Inheritance
    }
}
