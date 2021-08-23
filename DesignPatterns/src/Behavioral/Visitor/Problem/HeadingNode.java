package Behavioral.Visitor.Problem;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight Heading-Node");
    }

    @Override
    public void plainText() {
        System.out.println("PlainText Heading-Node");
    }
}
