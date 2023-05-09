package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utils.Idade;

public class Exercicio09 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantas pessoas voce vai digitar? ");
          Idade[] arr = new Idade[sc.nextInt()];
          sc.nextLine();
          for (int i = 0; i < arr.length; i++) {
               System.out.printf("Dados da %da pessoa: %n", i + 1);
               System.out.print("Nome: ");
               String name = sc.nextLine();
               System.out.print("Idade: ");
               int age = sc.nextInt();
               arr[i] = new Idade(name, age);
               sc.nextLine();

          }

          String olderPerson = "";
          int greaterAge = 0;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i].getAge() > greaterAge) {
                    greaterAge = arr[i].getAge();
                    olderPerson = arr[i].getName();
               }
          }
          System.out.printf("Pessoa mais velha: %s", olderPerson);
          sc.close();
     }
}
