package exercicios;

import java.util.Scanner;

import classes.src.entities.Banco;

public class Exercicio01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String accountNumber;
          String personName;
          double initialDeposit = 0;
          char hasInitialDeposit;
          Banco banco;





          System.out.println("Insira os seguintes dados para abertura da conta: ");
          System.out.print("Número da Conta: ");
          accountNumber = sc.nextLine();
          System.out.print("Nome do Cliente: ");
          personName = sc.nextLine();
          System.out.print("Deseja realizar um deposito inicial (s/n)? ");
          hasInitialDeposit = sc.next().charAt(0);

          if (hasInitialDeposit == 's') {
               System.out.print("Valor do deposito: ");
               initialDeposit = sc.nextDouble();

          }
     
          banco = new Banco(accountNumber, personName, initialDeposit);

          // banco.withdraw(2000);
          System.out.println("Informações da conta: ");

          System.out.printf("Conta %s, Cliente: %s, Saldo: %.2f%n",
                    banco.getAccountNumber(),
                    banco.getPersonName(),
                    banco.getBalance());

          System.out.print("Insira um valor de depósito: ");
          banco.deposit(sc.nextDouble());

          System.out.println("Informações da conta: ");
          System.out.printf("Conta %s, Cliente: %s, Saldo: %.2f%n",
                    banco.getAccountNumber(),
                    banco.getPersonName(),
                    banco.getBalance());

          System.out.print("Insira um valor de saque: ");
          banco.withdraw(sc.nextDouble());

          System.out.println("Informações da conta: ");
          System.out.printf("Conta %s, Cliente: %s, Saldo: %.2f%n",
                    banco.getAccountNumber(),
                    banco.getPersonName(),
                    banco.getBalance());
          sc.close();
     }
}
