package Behavioral.Strategy.Challenge;

public class Client {
    public static void main(String[] args) {
        var chatClient1 = new ChatClient(new AESEncryptionAlgorithm());
        chatClient1.send("Hello world 1");

        var chatClient2 = new ChatClient(new DESEncryptionAlgorithm());
        chatClient1.send("Hello world 2");
    }
}
