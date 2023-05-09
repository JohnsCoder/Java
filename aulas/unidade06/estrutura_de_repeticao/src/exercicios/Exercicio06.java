package exercicios;

import java.util.Scanner;

public class Exercicio06 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int time;
          System.out.print("Quantos numeros: ");
          time = sc.nextInt();
          for (int i = 1; i <= time; i++) {
               System.out.printf("Notas %d: %n", i);
               float n1 = sc.nextFloat();
               float n2 = sc.nextFloat();
               float n3 = sc.nextFloat();
               System.out.printf("media %d: %.1f%n", i, (n1 * 2) + (n2 * 3) + (n3 * 5) / 10);
          }
     }
}
