package classes;

import exceptions.CommandNotFoundException;
import exceptions.CommandsEmptyException;
import exceptions.DuplicatedCommandException;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList<String> commands;

    private Undo() {
        this.commands = new ArrayList<String>();
    }

    public static Undo getInstance() {
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) throws DuplicatedCommandException {
        String commandFound = this.findCommand(command);
        if(commandFound != null) {
            throw new DuplicatedCommandException("This command already exists.");
        }
        this.commands.add(command);
    }

    public void removeCommand(String command) throws CommandNotFoundException {
        String commandFound = this.findCommand(command);
        if(commandFound == null) {
            throw new CommandNotFoundException("This command doesn't exist.");
        }
        this.commands.remove(command);
    }

    public void showCommands() throws CommandsEmptyException {
        if(this.commands.isEmpty()) {
            throw new CommandsEmptyException("There are no available commands at the moment.");
        }
        this.commands.stream().forEach(System.out::println);

    }

    private String findCommand(String command) {
        String commandFound = this.commands.stream().filter(c -> c.equalsIgnoreCase(command)).findFirst().orElse(null);
        return commandFound;
    }


}

