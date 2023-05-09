package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos elementos vai ter o vetor? ");
          int[] arr = new int[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextInt();
          }
          double totalPair = 0;
          double sumPair = 0;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 == 0) {
                    totalPair += 1;
                    sumPair += arr[i];
               }
          }
          if (totalPair == 0) {
               System.out.println("Nenhum numero par");
          } else {
               System.out.printf("Media dos pares = %.2f", sumPair / totalPair);
          }
          sc.close();
     }
}
