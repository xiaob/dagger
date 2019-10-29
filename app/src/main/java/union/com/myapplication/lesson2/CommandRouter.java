package union.com.myapplication.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class CommandRouter {


    private final Map<String, Command> commands;

    @Inject
    public CommandRouter(Map<String, Command> commands){
        this.commands = commands;
    }

    Command.Result route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        List<String> args = splitInput.subList(1, splitInput.size());
        Command.Result result = command.handleInput(args);
        return result.status().equals(Command.Status.INVALID) ? invalidCommand(input) : result;
    }

    private Command.Result invalidCommand(String input) {
        System.out.println(
                String.format("couldn't understand \"%s\". please try again.", input));
        return Command.Result.invalid();
    }

    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}
