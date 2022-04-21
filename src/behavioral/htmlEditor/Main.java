package behavioral.htmlEditor;

import behavioral.htmlEditor.api.Command;
import behavioral.htmlEditor.api.History;

public class Main {
    public static void main(String[] args) {

        HtmlDocument htmlDoc = new HtmlDocument();
        History pdfHistory = new HtmlHistory();
        Command command = new BoldCommand(htmlDoc, pdfHistory);
        Command undo = new UndoCommand(pdfHistory);

        htmlDoc.setContent("hello, world");
        undo.execute();
        System.out.println(htmlDoc.getContent());
        command.execute();
        System.out.println(htmlDoc.getContent());
        undo.execute();
        System.out.println(htmlDoc.getContent());
    }
}
