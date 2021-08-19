package Behavioral.Iterator.Challenge;

import java.text.MessageFormat;

public class Product {
    private final int id;
    private final String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Product'{'id={0}, name=''{1}'''}'", id, name);
    }
}
