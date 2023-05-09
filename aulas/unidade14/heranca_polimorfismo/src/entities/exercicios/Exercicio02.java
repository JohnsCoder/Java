package entities.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio02 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          List<Product> products = new ArrayList<>();
          System.out.print("Enter the number of products: ");
          int productsCount = sc.nextInt();
          for (int i = 0; i < productsCount; i++) {
               sc.nextLine();
               System.out.printf("Product #%d data:%n", i + 1);
               System.out.print("Common, used or imported (c/u/i)? ");
               char productStatus = sc.nextLine().charAt(0);
               System.out.print("Name: ");
               String name = sc.nextLine();
               System.out.print("Price: ");
               Double price = sc.nextDouble();
               switch (productStatus) {
                    case 'u':
                    sc.nextLine();
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                         LocalDate manufactureDate = LocalDate.parse(sc.nextLine(),
                                   DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                         products.add(new UsedProduct(name, price, manufactureDate));
                         break;
                    case 'i':
                         System.out.print("Custom fee: ");
                         double customFee = sc.nextDouble();
                         products.add(new ImportedProduct(name, price, customFee));
                         break;
                    case 'c':
                         products.add(new Product(name, price));
               }

          }
          System.out.println("\nPRICE TAGS: ");

          for (Product p : products) {
               System.out.println(p.priceTag());
          }
          sc.close();
     }
}
