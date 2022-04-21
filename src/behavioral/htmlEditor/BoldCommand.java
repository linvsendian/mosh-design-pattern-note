package behavioral.htmlEditor;

import behavioral.htmlEditor.api.History;
import behavioral.htmlEditor.api.UndoableCommand;

public class BoldCommand implements UndoableCommand {
    private String preContent;
    private final HtmlDocument doc;
    private final History history;

    public BoldCommand(HtmlDocument doc, History history) {
        this.doc = doc;
        this.history = history;
    }

    @Override
    public void execute() {
        preContent = doc.getContent();
        doc.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute(){
        doc.setContent(preContent);
    }

}
