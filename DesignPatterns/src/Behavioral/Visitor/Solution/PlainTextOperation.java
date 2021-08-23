package Behavioral.Visitor.Solution;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("PlainText Heading-Node");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("PlainText Anchor-Node");
    }
}
