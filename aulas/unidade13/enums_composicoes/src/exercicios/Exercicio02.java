package exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus2;

public class Exercicio02 {
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter client data:");
          System.out.print("Name: ");
          String name = sc.nextLine();
          System.out.print("Email: ");
          String email = sc.nextLine();
          System.out.print("Birth date (DD/YY/YYYY): ");
          LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
          System.out.println("Enter order data:");
          System.out.print("Status: ");
          OrderStatus2 orderStatus =  OrderStatus2.valueOf(sc.nextLine());

          Client client = new Client(name, email, birthDate);
          
          Order2 order = new Order2(LocalDateTime.now(), orderStatus, client);
          System.out.print("How many items to this order? ");
          int itemsCount = sc.nextInt();
          
          for (int i = 0; i < itemsCount ; i++) {
               sc.nextLine();
               System.out.printf("Enter #%d item data: %n", i + 1);
               System.out.print("Product name: ");
               String productName = sc.nextLine();
               System.out.print("Product price: ");
               Double productPrice = sc.nextDouble();
               System.out.print("Quantity: ");
               Integer productQuantity = sc.nextInt();
               
               Product product = new Product(productName, productPrice);
               
               order.addItem(new OrderItem(productQuantity, productPrice, product));
          }


          System.out.println("ORDER SUMARY:");
          System.out.println(order);
               // System.out.println("Order moment: " + order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
               // System.out.println("Order status: " + order.getStatus());
               // System.out.println("Client: " + client.getName() + " (" + client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") - " + client.getEmail());
               // System.out.println("Order items: ");

               // for (OrderItem o : order.getOrderItems()) {
               //      System.out.println(o);
               // }
               // System.out.print("Total price: " + order.total());

          sc.close();
     }
}
