package Builder.Challenge;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        MealBuilder nonVegetarian = new NonVegetarianMealBuilder();
        director.construct(nonVegetarian);
        var meal1 = nonVegetarian.getMeal();
        meal1.showItems();

        MealBuilder vegetarian = new VegetarianMealBuilder();
        director.construct(vegetarian);
        var meal2 = vegetarian.getMeal();
        meal2.showItems();
    }
}
