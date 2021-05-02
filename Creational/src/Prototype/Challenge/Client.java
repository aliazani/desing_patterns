package Prototype.Challenge;

public class Client {
    public static void main(String[] args) {
        CarCache.loadCache();
        Car ford1 = CarCache.getCar("Ford");
        System.out.println(ford1.getModel());
        System.out.println(ford1.getName());
        System.out.println(ford1.getPrice());
        System.out.println(ford1.hashCode());

        Car ford2 = CarCache.getCar("Ford");
        System.out.println(ford2.getModel());
        System.out.println(ford2.getName());
        System.out.println(ford2.getPrice());
        System.out.println(ford2.hashCode());

        Car nano = CarCache.getCar("Nano");
        System.out.println(nano.getModel());
        System.out.println(nano.getName());
        System.out.println(nano.getPrice());
        System.out.println(nano.hashCode());
    }
}
