package union.com.myapplication.lesson2;





import android.accounts.Account;

import javax.inject.Inject;

import union.com.myapplication.lesson3.Database;

public class LoginCommand extends SingleArgCommand {

    private final Outputter outputter;
    private final Database database;

    @Inject
    public LoginCommand(Database database,Outputter outputter) {
        this.database = database;
        this.outputter = outputter;
    }

    @Override
    protected Status handleArg(String username) {
        Database.Account account = database.getAccount(username);
        outputter.output(username + " is logged in with balance: ."+account.balance());
        return Status.HANDLED;
    }

    @Override
    public String key() {
        return "login";
    }
}
