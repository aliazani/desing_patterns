package Builder.Challenge;

public class VegetarianBurger extends Burger {
    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public float price() {
        return 30.5F;
    }
}
