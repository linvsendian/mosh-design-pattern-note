package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"a", "b" ,"c"};
        for(String fileName : fileNames)
//            library.add(new RealEbook(fileName));
            library.add(new EbookProxy(fileName)); // lazy load
        library.openEbook("a");
//        library.openEbook("b");
    }
}
