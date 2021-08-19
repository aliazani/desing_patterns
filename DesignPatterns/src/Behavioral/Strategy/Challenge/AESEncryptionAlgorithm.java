package Behavioral.Strategy.Challenge;

import java.text.MessageFormat;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println(MessageFormat.format("Encrypting {0} using AES", message));

        return "Encrypted AES";
    }
}
