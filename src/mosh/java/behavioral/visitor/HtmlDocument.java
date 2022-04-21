package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }
    public void execute(Operation operation){
        for(HtmlNode node : nodes)
            node.execute(operation);
    }
//
//    public void highlight(){
//        for(HtmlNode node : nodes)
//            node.highlight();
//    }
}
