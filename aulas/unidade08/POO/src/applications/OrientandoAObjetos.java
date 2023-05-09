package POO.src.applications;

import java.util.Locale;
import java.util.Scanner;

import POO.src.entities.Product;

public class OrientandoAObjetos {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          Product product = new Product();
          System.out.println("Enter product data: ");

          System.out.print("Name: ");
          product.name = sc.nextLine();

          System.out.print("Price: ");
          product.price = sc.nextDouble();

          System.out.print("Quantity in stock: ");
          product.quantity = sc.nextInt();

          System.out.println(product);

          System.out.printf("Enter the number of products to be added in stock: ");
          product.AddProducts(sc.nextInt());

          System.out.printf("Updated: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price,
                    product.quantity,
                    product.TotalValueInStock());

          System.out.printf("Enter the number of products to be removed in stock: ");
          product.RemoveProducts(sc.nextInt());

          System.out.printf("Updated: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price,
                    product.quantity,
                    product.TotalValueInStock());

          sc.close();
     }
}
