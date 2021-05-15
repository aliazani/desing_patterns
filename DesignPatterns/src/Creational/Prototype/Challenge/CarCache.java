package Creational.Prototype.Challenge;

import java.util.Hashtable;

public class CarCache {
    private static final Hashtable<String, Car> carHashMap = new Hashtable<>();

    public static Car getCar(String name) {
        Car cachedCar =  carHashMap.get(name);
        return (Car) cachedCar.clone();
    }

    public static void loadCache() {
        Ford ford = new Ford("Yellow Ford");
        carHashMap.put(ford.getName(), ford);

        Nano nano = new Nano("Green Nano");
        carHashMap.put(nano.getName(), nano);

    }
}
