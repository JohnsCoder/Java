import java.util.Scanner;

import unidade15.exercicios.exercicio01.model.entities.Account;
import unidade15.exercicios.exercicio01.model.exceptions.LimitBalanceException;

public class App {
    public static void main(String[] args) throws Exception {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data - ");
            System.out.print("Number: ");
            int accNumber = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String accName = sc.nextLine();
            System.out.print("Initial balance: ");
            Double accBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account account = new Account(accNumber, accName, accBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            sc.close();
            account.withdraw(withdraw);
            System.out.println("\nNew balance: $" + account.getBalance());

        } catch (LimitBalanceException err) {
            System.out.println("Operation error: " + err.getMessage());
        }

    }
}
