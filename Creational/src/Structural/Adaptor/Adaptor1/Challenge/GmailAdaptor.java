package Structural.Adaptor.Adaptor1.Challenge;

import Structural.Adaptor.Adaptor1.Challenge.Gmail.GmailClient;

public class GmailAdaptor implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
