package Creational.Prototype.Prototype1;

public class Square extends Shape{
    public Square() {
        setType("Square");
        setId("2");
    }

    @Override
    void draw() {
        System.out.println("Draw inside the Square");
    }
}