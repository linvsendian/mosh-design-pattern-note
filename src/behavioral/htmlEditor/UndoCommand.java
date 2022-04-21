package behavioral.htmlEditor;

import behavioral.htmlEditor.api.History;
import behavioral.htmlEditor.api.UndoableCommand;
import behavioral.htmlEditor.api.Command;

public class UndoCommand implements Command {
    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0){
            UndoableCommand last = history.pop();
            last.unexecute();
        }
        else{
            System.out.println("already newest");
        }
    }

}
