package Structural.Adapter.Challenge;

public class Client {
    public static void main(String[] args) {
        var client = new EmailClient();

        client.addProvider(new GmailAdaptor());
        client.downloadEmails();
    }
}
