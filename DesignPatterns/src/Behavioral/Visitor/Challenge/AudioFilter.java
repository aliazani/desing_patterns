package Behavioral.Visitor.Challenge;

public interface AudioFilter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
