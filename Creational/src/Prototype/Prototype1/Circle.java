package Prototype.Prototype1;

public class Circle extends Shape{
    public Circle() {
        setType("Circle");
        setId("1");
    }

    @Override
    void draw() {
        System.out.println("draw inside Circle");
    }
}
