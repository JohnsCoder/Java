package exercicios;

import java.util.Scanner;

public class Exercicio08 {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int num;
          System.out.print("Digite um número para saber seus divisores: ");
          num = sc.nextInt();

          for (int i = 1; i <= num; i++) {
               if (num % i == 0) {
                    System.out.println(i);
               }
          }
     }

}
