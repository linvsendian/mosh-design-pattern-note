package structural.decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String data){
        System.out.println("store: " + data);
    }
}
