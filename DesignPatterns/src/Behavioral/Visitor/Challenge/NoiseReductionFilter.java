package Behavioral.Visitor.Challenge;

public class NoiseReductionFilter implements AudioFilter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Noise Reduction on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Noise Reduction on fact segment");
    }
}
