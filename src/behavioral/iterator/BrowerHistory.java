package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowerHistory {
    private final int URLS_LIMIT = 10;
    private List<String> urls = new ArrayList<>(URLS_LIMIT);
    public int index;
    public BrowerHistory(List<String> url) {
        this.urls = url;
    }



    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastOfIndex = urls.size() - 1;
        String lastOfItem = urls.get(lastOfIndex);
        urls.remove(lastOfIndex);
        return lastOfItem;
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<String> {

        private BrowerHistory history;
        private int index;

        public ListIterator(BrowerHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size() && index < URLS_LIMIT;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
