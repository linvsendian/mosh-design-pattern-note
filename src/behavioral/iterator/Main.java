package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        urls.add("www.baidu.com");
        urls.add("www.google.com");
        BrowerHistory browerHistory = new BrowerHistory(urls);
        Iterator<String> iterator = browerHistory.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }

        List<Integer> urls1 = new ArrayList<>(2);
        for(int i = 0; i < 10; i++)
            urls1.add(i);

        for (Integer integer : urls1) {
            System.out.println(integer);
        }


    }
}
