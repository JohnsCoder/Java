package exercicios;

import java.util.Scanner;

public class Exercicio08 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float salary;
          float imposto;
          System.out.println("Digite seu salário para saber o imposto pago!");
          salary = sc.nextFloat();
          sc.close();

          if (salary <= 2000) {
               imposto = 0;

          } else if (salary <= 3000) {
               imposto = (salary - 2000) * 0.08f;

          } else if (salary <= 4500) {
               imposto = (salary - 3000) * 0.18f + 1000 * 0.08f;

          } else {
               imposto = (salary - 4500) * 0.28f + 1500 * 0.18f + 1000 * 0.08f;
          }

          if (imposto == 0) {
               System.out.println("Insento");
          } else {
               System.out.printf("$ %.2f", imposto);
          }
     }
}
