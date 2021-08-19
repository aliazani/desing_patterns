package Behavioral.Iterator.Problem;


public class BrowseHistory2 {
    private final String[] history = new String[10];
    private int index = 0;

    public void push(String url) {
        history[index++] = url;
    }

    public String pop() {
        var lastUrl = history[--index];
        history[index] = null;

        return lastUrl;
    }

    public String[] getHistory() {
        return history;
    }
}
