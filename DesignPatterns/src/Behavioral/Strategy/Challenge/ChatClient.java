package Behavioral.Strategy.Challenge;

public class ChatClient {

    private EncryptionAlgorithm encryptor;

    public ChatClient(EncryptionAlgorithm encryptor) {
        this.encryptor = encryptor;
    }

    public void send(String message) {
        encryptor.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
