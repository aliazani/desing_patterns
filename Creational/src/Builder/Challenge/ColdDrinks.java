package Builder.Challenge;

public abstract class ColdDrinks implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
