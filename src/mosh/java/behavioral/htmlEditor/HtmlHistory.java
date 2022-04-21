package behavioral.htmlEditor;

import behavioral.htmlEditor.api.History;
import behavioral.htmlEditor.api.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class HtmlHistory implements History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    private final HtmlDocument preHtmlDocument = new HtmlDocument();

    @Override
    public void push(UndoableCommand command){
        commands.push(command);
    }
    @Override
    public UndoableCommand pop(){
        return commands.pop();
    }

    @Override
    public int size() {
        return commands.size();
    }
}
