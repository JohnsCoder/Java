package exercicios;
import java.util.Scanner;


public class Exercicio02 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num;
          System.out.println("Digite um número para saber se é par ou impar:");
          num = sc.nextInt();
          sc.close();
          if (num % 2 == 0) {
               System.out.println("é par!");
          } else {
               System.out.println("é impar!");
          }
     }
}
