package structural.decorator;

public class Encrypted implements Stream{
    private Stream stream;

    public Encrypted(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypted = encrypted(data);
        stream.write(encrypted);
    }

    public String encrypted(String data){
        return "@!@#&$!#!*@#^(!@";
    }
}
