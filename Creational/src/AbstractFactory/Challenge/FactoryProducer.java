package AbstractFactory.Challenge;

public class FactoryProducer {
    public static AbstractFactoryMovie getFactory(String factory) {
        if (factory.equalsIgnoreCase("hollywood"))
            return new HollywoodFactory();
        else if (factory.equalsIgnoreCase("bollywood"))
            return new BollywoodFactory();
        return null;
    }
}
