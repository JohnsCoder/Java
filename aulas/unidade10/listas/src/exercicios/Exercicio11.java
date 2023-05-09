package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utils.AlturaPorGenero;

public class Exercicio11 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantas pessoas serao digitadas? ");
          AlturaPorGenero[] arr = new AlturaPorGenero[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.printf("Digite altura e genero da %da pessoa:%n", i + 1);
               double height = sc.nextDouble();
               char gender = sc.next().charAt(0);
               arr[i] = new AlturaPorGenero(height, gender);
               sc.nextLine();
          }

          double shorterPerson = 1000;
          double tallerPerson = 0;

          char shorterPersonGerder = ' ';
          char tallerPersonGerder = ' ';

          double sumWomanHeight = 0;
          int womenCount = 0;

          int menCount = 0;
          for (int i = 0; i < arr.length; i++) {

               if (arr[i].getHeight() > tallerPerson) {
                    tallerPerson = arr[i].getHeight();
                    tallerPersonGerder = arr[i].getGender();

               }

               if (arr[i].getHeight() < shorterPerson) {
                    shorterPerson = arr[i].getHeight();
                    shorterPersonGerder = arr[i].getGender();
               }

               if (arr[i].getGender() == 'F') {
                    sumWomanHeight += arr[i].getHeight();
                    womenCount += 1;
               }
               if (arr[i].getGender() == 'M') {
                    menCount += 1;
               }
          }
          System.out.printf("Menor altura = %.2f, %c%n", shorterPerson, shorterPersonGerder);
          System.out.printf("Maior altura = %.2f, %c%n", tallerPerson, tallerPersonGerder);
          System.out.printf("Media das alturas das mulheres = %.2f%n", sumWomanHeight / womenCount);
          System.out.printf("Numero de homens = %d%n", menCount);
          sc.close();
     }
}
