package union.com.myapplication.lesson2;

import java.util.List;

public abstract class SingleArgCommand implements Command {

    @Override
    public Result handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Result.invalid();
    }

    /** Handles the single argument to the command. */
    protected abstract Result handleArg(String arg);
}
