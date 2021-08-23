package Behavioral.Visitor.Solution;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
