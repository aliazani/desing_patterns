package Creational.AbstractFactory.Challenge;

public abstract class AbstractFactoryMovie {
    public abstract HollywoodMovie getHollywoodGenre(String genre);

    public abstract BollywoodMovie getBollywoodGenre(String genre);
}
