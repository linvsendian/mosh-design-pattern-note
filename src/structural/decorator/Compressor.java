package structural.decorator;

public class Compressor implements Stream{
    private Stream stream;

    public Compressor(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressed = compress(data);
        stream.write(compressed);
    }

    public String compress(String data){
        return data.substring(0,5);
    }
}
