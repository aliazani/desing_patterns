package Behavioral.Iterator.Solution;

public class Client {
    public static void main(String[] args) {
        var history1 = new BrowseHistory1<String>();
        history1.push("google.com");
        history1.push("yahoo.com");
        history1.push("youtube.com");

        var iterator1 = history1.createIterator();
        System.out.println("History 1:");
        while (iterator1.hasNext()) {
            var url = iterator1.current();
            System.out.println(url);
            iterator1.next();
        }

        var history2 = new BrowseHistory2<String>(10);
        history2.push("google.com");
        history2.push("yahoo.com");
        history2.push("youtube.com");

        var iterator2 = history2.createIterator();
        System.out.println("History 2:");
        while (iterator2.hasNext()) {
            var url = iterator2.current();
            System.out.println(url);
            iterator2.next();
        }
    }
}
