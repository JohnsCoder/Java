package unidade15.reservation_reallyBadWay.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import unidade15.reservation_reallyBadWay.models.entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in date (dd/mm/yyyy): ");
        LocalDate checkinDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Check-out date (dd/mm/yyyy): ");
        LocalDate checkoutDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        if (checkinDate.isAfter(checkoutDate)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            LocalDate updatedCheckinDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/mm/yyyy): ");
            LocalDate updatedCheckoutDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (updatedCheckinDate.isAfter(updatedCheckoutDate)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                if (updatedCheckinDate.isBefore(LocalDate.now()) || updatedCheckoutDate.isBefore(LocalDate.now())) {
                    System.out.println("Error in reservation: Reservation dates for update must be future dates");
                    
                }
                reservation.updateDates(updatedCheckinDate, updatedCheckoutDate);
                System.out.println(reservation);
            }
        }
        

        sc.close();
    }
}
