package Creational.Builder.Challenge;

import java.util.ArrayList;

public class MealProduct {
    ArrayList<Item> mealItems;

    public MealProduct() {
        mealItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        mealItems.add(item);
    }

    public float getCoast() {
        float finalCost = 0.0F;

        for (var item : mealItems)
            finalCost += item.price();

        return finalCost;
    }

    public void showItems() {
        System.out.println("Meal Items:");
        for (var item : mealItems)
            System.out.println(item.name() + "->" + item.packing().pack() + "->" + item.price());
        System.out.println("total Cost: " + getCoast());
    }
}
