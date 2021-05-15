package Structural.Adaptor.Adaptor1.Challenge.Gmail;

public class GmailClient  {
  public void connect() {
    System.out.println("Connecting to Gmail");
  }

  public void getEmails() {
    System.out.println("Downloading emails from Gmail");
  }

  public void disconnect() {
    System.out.println("Disconnecting from Gmail");
  }
}
