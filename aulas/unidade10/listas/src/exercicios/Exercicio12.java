package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utils.Pensionato;

public class Exercicio12 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("How many rooms will be rented? ");
          int rented = sc.nextInt();
          Pensionato[] arr = new Pensionato[10];
          sc.nextLine();
          for (int i = 0; i < rented; i++) {
               System.out.printf("Rent #%d:%n", i + 1);
               System.out.print("Name: ");
               String name = sc.nextLine();
               System.out.print("Email: ");
               String email = sc.nextLine();
               System.out.print("Room: ");
               int quarto = sc.nextInt();
               System.out.println();

               arr[quarto] = new Pensionato(name, email, quarto);
               sc.nextLine();
          }
          System.out.printf("%nBusy rooms: %n");
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] != null) {

                    System.out.printf("%d: %s, %s%n", arr[i].getRoom(), arr[i].getName(), arr[i].getEmail());
               }
          }
          sc.close();
     }
}
