package Structural.Facade.Challenge;

public class Demo {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        var tweeterService = new TwitterApi("appKey", "secret");
        tweeterService.getRecentTweets();
    }
}
