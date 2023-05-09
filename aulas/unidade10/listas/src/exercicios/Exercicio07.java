package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos elementos vai ter o vetor? ");
          double[] arr = new double[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextDouble();
          }
          double sum = 0;
          for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
          }
          System.out.printf("Média do vetor =  %.3f%n", sum / arr.length);

          System.out.println("Elementos abaixo da media: ");
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] < sum / arr.length) {
                    System.out.println(arr[i]);
               }
          }
          sc.close();
     }
}
