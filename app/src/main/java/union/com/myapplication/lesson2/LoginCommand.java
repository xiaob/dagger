package union.com.myapplication.lesson2;

import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand {

    private final Outputter outputter;

    @Inject
    public LoginCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    protected Result handleArg(String username) {
        outputter.output(username + " is logged in.");
        return Result.handled();
    }

    @Override
    public String key() {
        return "login";
    }
}
