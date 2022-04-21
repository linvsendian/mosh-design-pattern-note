package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.service.CustomerService;

public class DeleteCustomerCommand implements Command {
    private CustomerService service;

    public DeleteCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.deleteCustomer();
    }
}
