package behavioral.command;

import behavioral.command.button.Button;
import behavioral.command.command.Command;
import behavioral.command.service.CustomerService;
import behavioral.command.textBox.TextBox;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        // add
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
        // delete
        command = new DeleteCustomerCommand(service);
        button = new Button(command);
        button.click();
        // submit text
        command = new SubmitCustomerCommand(service);
        TextBox textBox = new TextBox(command);
        textBox.submit();
        // CompositeCommand
        CompositeCommand composite = new CompositeCommand(service);
        composite.addCommand(new AddCustomerCommand(service));
        composite.addCommand(new DeleteCustomerCommand(service));
        composite.addCommand(new SubmitCustomerCommand(service));
        composite.execute();


    }
}
