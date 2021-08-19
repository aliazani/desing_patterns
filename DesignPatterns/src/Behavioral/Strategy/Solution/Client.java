package Behavioral.Strategy.Solution;

public class Client {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("user.png", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("user.png", new PNGCompressor(), new BlackAndWhiteFilter());
    }
}
