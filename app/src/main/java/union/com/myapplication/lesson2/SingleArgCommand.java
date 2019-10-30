package union.com.myapplication.lesson2;

import java.util.List;

public abstract class SingleArgCommand implements Command {

    @Override
    public Status handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Status.HANDLED;
    }

    /** Handles the single argument to the command. */
    protected abstract Status handleArg(String arg);
}
