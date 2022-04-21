package structural.decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new Encrypted(new CloudStream()));
        storeCreditCard(new Compressor(new CloudStream()));
    }
    public static void storeCreditCard(Stream stream){
        stream.write("1234-5678-9012-3456");
    }
}
