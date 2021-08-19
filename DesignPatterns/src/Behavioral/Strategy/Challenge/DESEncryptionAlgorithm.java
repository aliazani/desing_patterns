package Behavioral.Strategy.Challenge;

import java.text.MessageFormat;

public class DESEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println(MessageFormat.format("Encrypting {0} using DES", message));

        return "Encrypted DES";
    }
}
