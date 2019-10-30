package union.com.myapplication.lesson3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Database {
    private final Map<String ,Account> accounts = new HashMap<>();

    @Inject
    public Database() {
    }

   public Account getAccount(String username) {
        return accounts.computeIfAbsent(username,Account::new);
    }

    public static final class Account {
        private final String username;
        private BigDecimal balance = BigDecimal.ZERO;

        Account(String username) {
            this.username = username;
        }

        public String username() {
            return username;
        }

       public BigDecimal balance() {
            return balance;
        }

        public void deposit(BigDecimal bigDecimal) {
           balance = bigDecimal;
        }
    }
}
