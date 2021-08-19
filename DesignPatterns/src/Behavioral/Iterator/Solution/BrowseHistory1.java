package Behavioral.Iterator.Solution;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory1<T> {

    private List<T> history = new ArrayList<>();

    public void push(T url) {
        history.add(url);
    }

    public T pop() {
        var lastIndex = history.size() - 1;
        var lastItem = history.get(lastIndex);
        history.remove(lastItem);

        return lastItem;
    }

    public Iterator<T> createIterator() {
        return new ListIterator();
    }


    public class ListIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return (index < history.size());
        }

        @Override
        public T current() {
            return history.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
