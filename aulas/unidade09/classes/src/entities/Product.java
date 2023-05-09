package classes.src.entities;

public class Product {
     // encapsulamento
     private String name;
     private double price;
     private int amount;

     // constructor
     public Product(String name, double price, int amount) {
          // this
          this.name = name;
          this.price = price;
          this.amount = amount;
     }

     // supercharge
     public Product(String name, double price) {
          this.name = name;
          this.price = price;
     }
     // supercharge

     public Product() {

     }

     // setter
     public void setName(String name) {
          this.name = name;
     }

     // getter
     public String getName() {
          return this.name;
     }
     // setter
     public void setPrice(double price) {
          this.price = price;
     }

     // getter
     public double getPrice() {
          return this.price;
     }

     // getter
     public int getAmount() {
          return this.amount;
     }

     public double TotalValueInStock() {
          return price * amount;

     }

     public void AddProducts(int amount) {
          this.amount += amount;
     }

     public void RemoveProducts(int amount) {
          this.amount -= amount;
     }

     public String toString() {
          return name
                    + ", $ "
                    + String.format("%.2f", price)
                    + ", "
                    + amount
                    + " units, Total: $ "
                    + String.format("%.2f", TotalValueInStock());
     }


}
