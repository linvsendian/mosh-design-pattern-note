package behavioral.strategy;

public class JPGCompressor implements Compressor{

    @Override
    public void compressor(String fileName) {
        System.out.println("JPGCompressor");
    }
}
