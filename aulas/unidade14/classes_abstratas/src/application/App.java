import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        List<Account> accounts = new ArrayList<>();

        // Account acc1 = new Account(1001, "Alex", 1000.0);

        accounts.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        accounts.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        accounts.add(new SavingsAccount(1001, "Bob", 300.0, 0.01));

        accounts.add(new BusinessAccount(1002, "Anna", 500.0, 500.0));

        double sum = 0;
        for (Account a : accounts) {
            sum += a.getBalance();
        }

        System.out.println("TotalBalance: " + sum);

        for (Account a : accounts) {
            a.deposit(10);
        }
        for (Account a : accounts) {
            System.out.println("Updated balance for account " + a.getNumber() + ": " + a.getBalance());
        }

    }
}
