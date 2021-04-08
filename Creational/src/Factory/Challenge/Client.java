package Factory.Challenge;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        var tiger = factory.getAnimal("tiger");
        tiger.eat();
        tiger.walk();

        var duck = factory.getAnimal("duck");
        duck.eat();
        duck.walk();
    }

}
