package union.com.myapplication.lesson2;

import java.util.List;
import java.util.Optional;

public interface Command {
    /**
     * String token that signifies this command should be selected (e.g.:
     * "deposit", "withdraw")
     */
    String key();

    /** Process the rest of the command's words and do something. */
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }
}