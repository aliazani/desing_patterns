package Behavioral.Visitor.Problem;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight Anchor-Node");
    }

    @Override
    public void plainText() {
        System.out.println("PlainText Anchor-Node");
    }
}
