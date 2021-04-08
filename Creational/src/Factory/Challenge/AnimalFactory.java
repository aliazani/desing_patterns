package Factory.Challenge;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("tiger"))
            return new Tiger();
        else if (animalType.equalsIgnoreCase("duck"))
            return new Duck();

        return null;
    }
}
