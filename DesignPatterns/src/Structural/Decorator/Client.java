package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        var encryptedAndCompressedCloudStream = new CompressedCloudStream
                (new EncryptedCloudStream
                        (new CloudStream()));
        encryptedAndCompressedCloudStream.write("Password: 12345");
    }
}
