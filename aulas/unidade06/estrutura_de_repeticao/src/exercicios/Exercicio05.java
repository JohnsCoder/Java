package exercicios;

import java.util.Scanner;

public class Exercicio05 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int time;
          int num;
          int in = 0;
          int out = 0;
          System.out.print("Quantos números? ");
          time = sc.nextInt();
          for(int i = 1; i <= time; i++) {
               System.out.print("num: ");
               num = sc.nextInt();
               if (num >=10 && num <= 20) {
                    in += 1;

               } else {
                    out += 1;
               }
          }
          System.out.printf("%d in%n", in);
          System.out.printf("%d out", out);

     }
}
