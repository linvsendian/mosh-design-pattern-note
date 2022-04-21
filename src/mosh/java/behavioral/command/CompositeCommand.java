package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();
    private CustomerService service;

    public CompositeCommand(CustomerService service) {
        this.service = service;
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }
}
