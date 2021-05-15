package Creational.Builder.Challenge;

public class Director {
    MealBuilder mealBuilder;

    public void construct(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
