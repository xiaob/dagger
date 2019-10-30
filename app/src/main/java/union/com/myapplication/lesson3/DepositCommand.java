package union.com.myapplication.lesson3;

import android.util.Log;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import union.com.myapplication.lesson2.Command;
import union.com.myapplication.lesson2.Outputter;

public class DepositCommand implements Command {

    private final Outputter outputter;
    private final Database database;

    @Inject
    public DepositCommand(Outputter outputter, Database database) {
        this.outputter = outputter;
        this.database = database;
    }

    @Override
    public String key() {
        return "deposit";
    }

    @Override
    public Status handleInput(List<String> input) {
        Database.Account account = database.getAccount(input.get(0));
        account.deposit(new BigDecimal(input.get(1)));
        Log.i("grage",account.toString());
        outputter.output(account.username() + " now has: " + account.balance());
        return Status.HANDLED;
    }
}
