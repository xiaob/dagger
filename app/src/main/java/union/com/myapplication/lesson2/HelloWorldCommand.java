package union.com.myapplication.lesson2;

import java.util.List;

import javax.inject.Inject;

import dagger.Module;

public class HelloWorldCommand implements Command {

    private final Outputter outputter;

    @Inject
    HelloWorldCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "Hello";
    }

    @Override
    public Result  handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Result.invalid();
        }
        outputter.output("world!");
        return Result.handled();
    }
}
