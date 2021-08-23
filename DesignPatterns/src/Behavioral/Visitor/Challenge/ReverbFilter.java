package Behavioral.Visitor.Challenge;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("reverb Filter on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("reverb Filter on fact segment");
    }
}
