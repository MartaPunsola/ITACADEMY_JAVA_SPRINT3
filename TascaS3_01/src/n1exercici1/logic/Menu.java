package logic;

import Exceptions.CommandNotFoundException;
import Exceptions.CommandsEmptyException;
import Exceptions.DuplicatedCommandException;
import classes.Undo;
import utils.Input;

public class Menu {

    private Undo commands = Undo.getInstance();

    public Menu() {
    }

    public void start() {
        int option = 0;
        String command = "";

        do {
            option = menu();
            switch(option) {
                case 0:
                    System.out.println("You are exiting the system. Goodbye!");
                    break;
                case 1:
                    command = Input.readString("Introduce your command:");
                    try {
                        commands.addCommand(command);
                        System.out.println("The command \'" + command + "\' has been introduced.");
                    } catch (DuplicatedCommandException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    command = Input.readString("Which command do you want to remove?");
                    try {
                        commands.removeCommand(command);
                        System.out.println("The command \'" + command + "\' has been removed.");
                    } catch (CommandNotFoundException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        commands.showCommands();
                    } catch (CommandsEmptyException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Only 0, 1, 2 and 3 are valid answers. Please, try again.");
            }
        } while (option != 0);
    }

    private int menu() {
        int option = 0;
        option = Input.readInt("Choose the action:\n"
                + "1. Add a command."
                + "\n2. Cancel a command."
                + "\n3. Show recent commands."
                + "\n0. Exit");
        return option;
    }

}
