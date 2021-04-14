package Builder;

public class Car implements BuilderInterface{
    Product car = new Product();
    @Override
    public void buildBody() {
        car.add("Building body of car");
    }

    @Override
    public void insertWheels() {
        car.add("Add 4 wheels for car");
    }

    @Override
    public void addHeadlights() {
        car.add("Add 4 Headlight for car");
    }

    @Override
    public Product getVehicle() {
        return car;
    }
}
