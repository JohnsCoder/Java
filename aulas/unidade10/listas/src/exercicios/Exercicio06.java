package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos valores vai ter em cada vetor? ");
          int n  = sc.nextInt();

          int[] arr = new int[n];
          int[] arr2 = new int[n];

          System.out.println("Digite os valores do vetor A: ");
          for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
          }

          System.out.println("Digite os valores do vetor B: ");
          for (int i = 0; i < arr.length; i++) {
               arr2[i] = sc.nextInt();
          }

          System.out.println("Vetor Resultante: ");
          for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i] + arr2[i]);
          }
          sc.close();
     }
}
