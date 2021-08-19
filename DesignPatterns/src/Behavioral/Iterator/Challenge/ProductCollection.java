package Behavioral.Iterator.Challenge;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    class ListIterator implements Iterator {
        private ProductCollection collection;
        private int index;


        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
