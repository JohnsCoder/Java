package classes.src.entities;

public class Banco {
     private String accountNumber;
     private String personName;
     private double balance;

     public Banco(String accountNumber, String personName, double initialDeposit) {
          this.accountNumber = accountNumber;
          this.personName = personName;
          this.balance = initialDeposit;
     }

     public Banco(String accountNumber, String personName) {
          this.accountNumber = accountNumber;
          this.personName = personName;
     }

     public String getAccountNumber() {
          return accountNumber;
     }

     public String getPersonName() {
          return personName;
     }

     public double getBalance() {
          return balance;
     }

     public void setPersonName(String personName) {
          this.personName = personName;
     }

     public void deposit(double value) {
          balance += value;
     }

     public void withdraw(double value) {
          balance -= (value + 5);

     }
}
