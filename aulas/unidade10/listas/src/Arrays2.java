import java.util.Locale;
import java.util.Scanner;

import utils.Produto;

public class Arrays2 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Insira uma quntidade de produtos: ");

          Produto[] prod = new Produto[sc.nextInt()];
          for (int i = 0; i < prod.length; i++) {
               System.out.print("Digite o nome do produto: ");
               sc.nextLine();
               String name = sc.nextLine();
               System.out.print("Digite o preço do produto: ");
               double price = sc.nextDouble();
               prod[i] = new Produto(name, price);
          }

          double sum = 0;
          for (int i = 0; i < prod.length; i++) {
               sum += prod[i].getPrice();

          }
          System.out.printf("Average Price = %.2f", sum / prod.length);
          sc.close();

     }
}
