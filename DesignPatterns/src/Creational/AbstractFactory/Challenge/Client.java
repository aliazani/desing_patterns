package Creational.AbstractFactory.Challenge;

public class Client {
    public static void main(String[] args) {
        var hollywoodFactory = FactoryProducer.getFactory("hollywood");
        hollywoodFactory.getHollywoodGenre("action").getMovieName();
        hollywoodFactory.getHollywoodGenre("comedy").getMovieName();

        var bollywoodFactory = FactoryProducer.getFactory("bollywood");
        bollywoodFactory.getBollywoodGenre("action").getMovieName();
        bollywoodFactory.getBollywoodGenre("comedy").getMovieName();
    }
}
