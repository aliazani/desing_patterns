package Creational.Prototype.Challenge;

public class Ford extends Car {
    public Ford(String model) {
        setName("Ford");
        setPrice(4_000F);
        setModel(model);
    }

    @Override
    public Car clone() {
       return (Ford) super.clone();
    }
}
