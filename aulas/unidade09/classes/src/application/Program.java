package application;


import java.util.Locale;
import java.util.Scanner;

import classes.src.entities.Product;

public class Program {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter product data: ");

          System.out.print("Name: ");
          String name = sc.nextLine();

          System.out.print("Price: ");
          double price = sc.nextDouble();

          System.out.print("Amount in stock: ");
          int amount = sc.nextInt();
          // constructor
          Product product = new Product(name, price, amount);

          System.out.println(product);

          System.out.printf("Enter the number of products to be added in stock: ");
          product.AddProducts(sc.nextInt());

          System.out.printf("Updated: %s, $ %.2f, %d units, Total: $ %.2f%n", product.getPrice(), product.getPrice(),
                    product.getAmount(),
                    product.TotalValueInStock());

          System.out.printf("Enter the number of products to be removed in stock: ");
          product.RemoveProducts(sc.nextInt());

          System.out.printf("Updated: %s, $ %.2f, %d units, Total: $ %.2f%n", product.getName(), product.getPrice(),
                    product.getAmount(),
                    product.TotalValueInStock());

          sc.close();
     }
}
