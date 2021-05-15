package Creational.Factory.Challenge;

public class Tiger implements Animal{
    @Override
    public void walk() {
        System.out.println("Tiger -> walk");
    }

    @Override
    public void eat() {
        System.out.println("Tiger -> eat");
    }
}
