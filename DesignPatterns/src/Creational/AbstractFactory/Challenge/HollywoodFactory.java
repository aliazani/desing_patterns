package Creational.AbstractFactory.Challenge;

public class HollywoodFactory extends AbstractFactoryMovie {
    @Override
    public HollywoodMovie getHollywoodGenre(String genre) {
        if (genre.equalsIgnoreCase("comedy"))
            return new HollywoodComedyMovie();
        else if (genre.equalsIgnoreCase("action"))
            return new HollywoodActionMovie();
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodGenre(String genre) {
        return null;
    }
}
