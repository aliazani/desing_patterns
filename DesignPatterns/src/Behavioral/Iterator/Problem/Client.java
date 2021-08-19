package Behavioral.Iterator.Problem;

public class Client {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("google.com");
        history.push("yahoo.com");
        history.push("youtube.com");

        System.out.println("History 1:");
        for (int i = 0; i < history.getUrls().size(); i++) {
            var url = history.getUrls().get(i);
            System.out.println(url);
        }

        var history2 = new BrowseHistory2();
        history2.push("google.com");
        history2.push("yahoo.com");
        history2.push("youtube.com");

        System.out.println("History 2:");
        for (int i = 0; i < history2.getHistory().length; i++) {
            var url = history2.getHistory()[i];
            if (url != null)
                System.out.println(url);
        }
    }
}
