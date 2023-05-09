package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

     public static void showValue(int amount, float price) {
          System.out.printf("Total: R$ %.2f", amount * price);
     }

     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          int ID;
          int amount;
          System.out.println("Informe o código e quantidade do produto!");
          System.out.print("Código: ");
          ID = sc.nextInt();
          System.out.print("Quantidade: ");
          amount = sc.nextInt();
          sc.close();

          switch (ID) {
               case 1:
                    showValue(amount, 4);
                    break;
               case 2:
                    showValue(amount, 4.5f);
                    break;
               case 3:
                    showValue(amount, 5);
                    break;
               case 4:
                    showValue(amount, 2);
                    break;
               case 5:
                    showValue(amount, 1.5f);
                    break;
                    default:
                    System.out.println("Código Inválido!");

          }
     }

}
