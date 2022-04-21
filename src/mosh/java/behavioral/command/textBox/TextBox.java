package behavioral.command.textBox;

import behavioral.command.command.Command;

public class TextBox {
    private Command command;

    public TextBox(Command command) {
        this.command = command;
    }

    public void submit(){
       command.execute();
    }
}
