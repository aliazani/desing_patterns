package Creational.Prototype.Challenge;

public class Nano extends Car {
    public Nano(String model) {
        setName("Nano");
        setPrice(8_000F);
        setModel(model);
    }

    @Override
    public Car clone() {
        return (Nano) super.clone();
    }
}
