package exercicios;

import java.util.Scanner;

public class Exercicio03 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x;
          int y;
          System.out.println("Digite dois números para saber se são multiplos:");
          System.out.print("Número 1: ");
          x = sc.nextInt();
          System.out.print("Número 2: ");
          y = sc.nextInt();
          sc.close();
          if (x % y == 0 || y % x == 0) {
               System.out.println("Sâo multiplos!");
          } else {
               System.out.println("Não são multiplos!");
          }
     }
}
