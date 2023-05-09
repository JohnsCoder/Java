package exercicios;

import java.util.Scanner;

public class Exercicio03 {
     public int alcool;
     public int gasolina;
     public int diesel;

     public void increaseAmount(int ID) {
          switch (ID) {
               case 1:
                    alcool += 1;
                    break;
               case 2:
                    gasolina += 1;
                    break;
               case 3:
                    diesel += 1;
               default:
                    return;
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int ID = 0;
          Exercicio03 fuelAmount = new Exercicio03();

          System.out.println("Insira o código do produto que irá usar!");
          System.out.println("1.Álcool");
          System.out.println("2.Gasolina");
          System.out.println("3.Diesel");
          System.out.printf("4.Finalizar%n%n");

          while (ID != 4) {
               System.out.print("ID: ");
               ID = sc.nextInt();
               fuelAmount.increaseAmount(ID);
          }
          System.out.println("MUITO OBRIGADO!");
          System.out.printf("Alcool: %d%n", fuelAmount.alcool);
          System.out.printf("Gasolina: %d%n", fuelAmount.gasolina);
          System.out.printf("Diesel: %d%n", fuelAmount.diesel);

     }
}
