package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utils.Notas;

public class Exercicio10 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos alunos serao digitados? ");
          Notas[] arr = new Notas[sc.nextInt()];
          sc.nextLine();
          for (int i = 0; i < arr.length; i++) {
               System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
               String name = sc.nextLine();
               double firstGrade = sc.nextDouble();
               double secoundGrade = sc.nextDouble();
               arr[i] = new Notas(name, firstGrade, secoundGrade);
               sc.nextLine();
          }

          System.out.println("Alunos aprovados: ");
          for (int i = 0; i < arr.length; i++) {
               double averageGrade = (arr[i].getFirstGrade() + arr[i].getSecoundGrade()) / 2;
               // System.out.println(averageGrade);
               if (averageGrade >= 6) {
                    System.out.println(arr[i].getName());
               }
          }
          sc.close();
     }
}
