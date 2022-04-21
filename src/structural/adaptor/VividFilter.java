package structural.adaptor;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("vivid image Filter ... ");
    }
}
