package Behavioral.Visitor.Challenge;

public class Client {
    public static void main(String[] args) {
        var wavFile = WavFile.read("file.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        System.out.println();
        wavFile.applyFilter(new ReverbFilter());
        System.out.println();
        wavFile.applyFilter(new NormalizeFilter());

    }
}
