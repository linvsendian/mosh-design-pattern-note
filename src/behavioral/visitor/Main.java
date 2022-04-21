package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());
        doc.execute(new HighlightOperation());
        doc.execute(new PlainTextOperation());
    }
}
