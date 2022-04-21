package structural.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("load the Ebook " + fileName);
    }
    @Override
    public void show(){
        System.out.println("showing the Ebook " + fileName);
    }
    @Override
    public String getFileName() {
        return fileName;
    }
}
