package Creational.Builder;

public class Motorcycle implements BuilderInterface {
    Product motorcycle = new Product();

    @Override
    public void buildBody() {
        motorcycle.add("Building body of motorcycle");
    }

    @Override
    public void insertWheels() {
        motorcycle.add("insert 2 wheels to motorcycle");
    }

    @Override
    public void addHeadlights() {
        motorcycle.add("insert 2 headlight to motorcycle");
    }

    @Override
    public Product getVehicle() {
        return motorcycle;
    }
}
