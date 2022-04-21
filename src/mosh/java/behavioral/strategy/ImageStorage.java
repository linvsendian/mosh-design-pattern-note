package behavioral.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;


    public void store(String fileName){
        compressor.compressor(fileName);
        filter.filter(fileName);
    }
}
