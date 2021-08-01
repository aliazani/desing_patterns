package Structural.Facade.Challenge;

public class TwitterApi {
    private String appKey;
    private String secret;

    public TwitterApi(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public void getRecentTweets() {
        String accessToken = getAccessToken(appKey, secret);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
        System.out.println(tweets);
    }

    private String getAccessToken(String appKey, String secret) {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        return oauth.getAccessToken(requestToken);
    }
}
