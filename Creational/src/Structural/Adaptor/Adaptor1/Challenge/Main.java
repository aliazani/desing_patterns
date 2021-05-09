package Structural.Adaptor.Adaptor1.Challenge;

public class Main {
    public static void main(String[] args) {
        var client = new EmailClient();

        client.addProvider(new GmailAdaptor());
        client.downloadEmails();
    }
}
