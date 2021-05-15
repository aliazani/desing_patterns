package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        director.construct(carBuilder);
        var p1 = carBuilder.getVehicle();
        p1.show();

        BuilderInterface motorcycleBuilder = new Motorcycle();
        director.construct(motorcycleBuilder);
        var p2 = motorcycleBuilder.getVehicle();
        p2.show();

    }
}
