package Creational.Factory.Challenge;

public class Duck implements Animal {
    @Override
    public void walk() {
        System.out.println("Duck -> walk");
    }

    @Override
    public void eat() {
        System.out.println("Duck -> eat");
    }
}
