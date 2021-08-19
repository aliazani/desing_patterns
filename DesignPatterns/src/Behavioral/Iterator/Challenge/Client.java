package Behavioral.Iterator.Challenge;

public class Client {
    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "Car"));
        collection.add(new Product(2, "Motorcycle"));
        collection.add(new Product(3, "Bicycle"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }

    }
}
