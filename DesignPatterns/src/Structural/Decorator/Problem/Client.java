package Structural.Decorator.Problem;

public class Client {
    public static void main(String[] args) {
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("password");
    }
}
