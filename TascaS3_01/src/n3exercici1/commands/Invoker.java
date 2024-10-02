package commands;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<CommandVehicle> commands = new ArrayList<CommandVehicle>();

    public void addCommand(CommandVehicle command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        this.commands.forEach(c -> c.execute());
        this.commands.clear();
    }
}
