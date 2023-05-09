
package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus2;

public class Order2 {


     private LocalDateTime moment;
     private OrderStatus2 status;
     private List<OrderItem> items = new ArrayList<>();
     private Client client;

     public Order2() {
     }

     public Order2(LocalDateTime moment, OrderStatus2 status, Client client) {

          this.moment = moment;
          this.status = status;
          this.client = client;
     }

     public LocalDateTime getMoment() {
          return moment;
     }

     public void setMoment(LocalDateTime moment) {
          this.moment = moment;
     }

     public OrderStatus2 getStatus() {
          return status;
     }

     public void setStatus(OrderStatus2 status) {
          this.status = status;
     }

     public Client getClient() {
          return client;
     }

     public void setClient(Client client) {
          this.client = client;
     }

     public void addItem(OrderItem item) {
          items.add(item);
     }

     public void removeItem(OrderItem item) {
          items.remove(item);
          
     }

     public Double total() {
          Double sum = 0.0;
               for (OrderItem o : items) {
                    sum += o.subTotal();
               }
               return sum;
     }

     @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
    

}

