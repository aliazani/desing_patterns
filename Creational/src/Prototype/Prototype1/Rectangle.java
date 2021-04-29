package Prototype.Prototype1;

public class Rectangle extends Shape{
    public Rectangle() {
        setType("Rectangle");
        setId("3");
    }

    @Override
    void draw() {
        System.out.println("Draw inside the Rectangle");
    }
}
