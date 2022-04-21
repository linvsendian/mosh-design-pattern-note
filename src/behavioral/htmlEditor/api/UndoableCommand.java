package behavioral.htmlEditor.api;

public interface UndoableCommand extends Command{
    void unexecute();
}
