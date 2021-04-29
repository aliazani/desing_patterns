package Prototype.Prototype1;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape Type: " + clonedShape1.getType());
        System.out.println(clonedShape1.hashCode());
        clonedShape1.draw();

        Shape clonedShape4 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape Type: " + clonedShape4.getType());
        System.out.println(clonedShape4.hashCode());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape Type: " + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape Type: " + clonedShape3.getType());
        clonedShape3.draw();

    }
}
