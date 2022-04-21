package behavioral.strategy;

public class PNGCompressor implements Compressor{

    @Override
    public void compressor(String fileName) {
        System.out.println("PNG compressor");
    }
}
