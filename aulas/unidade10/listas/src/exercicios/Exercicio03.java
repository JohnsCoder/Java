package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utils.Alturas;

public class Exercicio03 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantas pessoas serao digitadas? ");
          Alturas[] arr = new Alturas[sc.nextInt()];
          sc.nextLine();
          for (int i = 0; i < arr.length; i++) {
               System.out.printf("Dados da %da pessoa: %n", i + 1);
               System.out.print("Nome: ");
               String name = sc.nextLine();
               System.out.print("Idade: ");
               int age = sc.nextInt();
               System.out.print("Altura: ");
               double height = sc.nextDouble();
               arr[i] = new Alturas(name, age, height);
               sc.nextLine();
          }

          double totalHeight = 0;
          double underSixteen = 0;
          for (int i = 0; i < arr.length; i++) {
               totalHeight += arr[i].getHeight();
               if (arr[i].getAge() < 16) {
                    underSixteen += 1;

               }
          }
          System.out.printf("%nAltura media: %.2f%n", totalHeight / arr.length);
          System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", underSixteen * 100 / arr.length);
          for (int i = 0; i < arr.length; i++) {
               totalHeight += arr[i].getHeight();
               if (arr[i].getAge() < 16) {
                    System.out.println(arr[i].getName());

               }
          }
          sc.close();
     }
}
