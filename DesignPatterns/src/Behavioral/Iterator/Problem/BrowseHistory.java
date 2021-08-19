package Behavioral.Iterator.Problem;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> history = new ArrayList<>();

    public void push(String url) {
        history.add(url);
    }

    public String pop() {
        var lastIndex = history.size() - 1;
        var lastUrl = history.get(lastIndex);
        history.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return history;
    }
}
