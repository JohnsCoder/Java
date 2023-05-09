package exercicios;

import java.util.Scanner;

public class Exercicio09 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num;
          System.out.print("Quantas linhas: ");
          num = sc.nextInt();
          sc.close();
          for (int i = 1; i < num ; i++) {
               System.out.printf("%d %.0f %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
          }
     }
}
