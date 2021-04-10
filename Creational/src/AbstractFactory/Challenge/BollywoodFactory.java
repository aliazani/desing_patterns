package AbstractFactory.Challenge;

public class BollywoodFactory extends AbstractFactoryMovie {
    @Override
    public BollywoodMovie getBollywoodGenre(String genre) {
        if (genre.equalsIgnoreCase("comedy"))
            return new BollywoodComedyMovie();
        else if (genre.equalsIgnoreCase("action"))
            return new BollywoodActionMovie();
        return null;
    }

    @Override
    public HollywoodMovie getHollywoodGenre(String genre) {
        return null;
    }
}
