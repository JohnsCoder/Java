import java.util.Scanner;

public class Exercicio03 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a;
          int b;
          int c;
          int d;

          System.out.println("Show differnce between, the product of A,B with B,C");
          System.out.print("A value: ");
          a = sc.nextInt();
          System.out.print("B value: ");
          b = sc.nextInt();
          System.out.print("C value: ");
          c = sc.nextInt();
          System.out.print("D value: ");
          d = sc.nextInt();
          System.out.printf("The difference, between the values is: %d", (a * b) - (c * d));
          sc.close();
     }
}
