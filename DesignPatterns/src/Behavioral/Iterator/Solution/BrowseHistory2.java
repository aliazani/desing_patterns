package Behavioral.Iterator.Solution;

public class BrowseHistory2<T> {
    private final T[] history;
    private int index1;

    public BrowseHistory2(int count) {
        history = (T[]) new Object[count];
    }

    public void push(T url) {
        history[index1++] = url;
    }

    public T pop() {
        var lastItem = history[--index1];
        history[index1] = null;
        return lastItem;
    }

    public Iterator<T> createIterator() {
        return new ArrayIterator();
    }


    public class ArrayIterator implements Iterator<T> {
        private int index2;

        @Override
        public boolean hasNext() {
            return (index2 < index1);
        }

        @Override
        public T current() {
            return history[index2];
        }

        @Override
        public void next() {
            index2++;
        }
    }
}
