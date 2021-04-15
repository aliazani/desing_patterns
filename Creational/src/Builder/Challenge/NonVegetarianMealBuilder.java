package Builder.Challenge;

public class NonVegetarianMealBuilder implements MealBuilder {
    MealProduct nonVegetarianMeal;

    public NonVegetarianMealBuilder() {
        nonVegetarianMeal = new MealProduct();
    }

    @Override
    public void buildBurger() {
        nonVegetarianMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegetarianMeal.addItem(new Coca());
    }

    @Override
    public MealProduct getMeal() {
        return nonVegetarianMeal;
    }
}
