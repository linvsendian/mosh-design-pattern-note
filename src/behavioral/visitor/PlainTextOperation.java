package behavioral.visitor;

public class PlainTextOperation implements  Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("heading plain");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("archor plain");

    }
}
