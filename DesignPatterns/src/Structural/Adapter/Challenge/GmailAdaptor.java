package Structural.Adapter.Challenge;

import Structural.Adapter.Challenge.Gmail.GmailClient;

public class GmailAdaptor implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
