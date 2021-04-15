package Builder.Challenge;

public class VegetarianMealBuilder implements MealBuilder {
    MealProduct vegetarianMeal;

    public VegetarianMealBuilder() {
        vegetarianMeal = new MealProduct();
    }

    @Override
    public void buildBurger() {
        vegetarianMeal.addItem(new VegetarianBurger());
    }

    @Override
    public void buildDrink() {
        vegetarianMeal.addItem(new Pepsi());
    }

    @Override
    public MealProduct getMeal() {
        return vegetarianMeal;
    }
}
