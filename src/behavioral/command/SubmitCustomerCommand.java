package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.service.CustomerService;

public class SubmitCustomerCommand implements Command {
    private CustomerService service;

    public SubmitCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute(){
        service.inputIntoTextBox();
    }
}
