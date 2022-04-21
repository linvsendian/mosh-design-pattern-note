package behavioral.htmlEditor.api;

public interface History {
    void push(UndoableCommand command);
    UndoableCommand pop();
    int size();
}
