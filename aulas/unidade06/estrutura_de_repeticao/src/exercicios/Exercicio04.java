package exercicios;

import java.util.Scanner;

public class Exercicio04 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int value;
          System.out.print("Digite um número: ");
          value = sc.nextInt();
          for (int i = 1; i <= value; i++) {
               if (i % 2 != 0) {
                    System.out.printf("%d%n",i);
               }
          }
     }
}
