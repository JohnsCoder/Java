import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import unidade15.reservation_goodWay.model.entities.Reservation;
import unidade15.reservation_goodWay.model.exceptions.DomainException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (dd/mm/yyyy): ");
            LocalDate checkinDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (dd/mm/yyyy): ");
            LocalDate checkoutDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);

            System.out.println(reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            LocalDate updatedCheckinDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/mm/yyyy): ");
            LocalDate updatedCheckoutDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            reservation.updateDates(updatedCheckinDate, updatedCheckoutDate);
            System.out.println(reservation);

        } catch (DomainException err) {
            System.out.println("Error in reservation: " + err.getMessage());
        }
        catch (RuntimeException err) {
            System.out.println("Unexpected error: " + err.fillInStackTrace());
        }

        // if (checkinDate.isAfter(checkoutDate)) {
        // System.out.println("Error in reservation: Check-out date must be after
        // check-in date");
        // } else {

        // if (error != null) {
        // System.out.println("Error in reservation: " + error);
        // } else {
        // System.out.println(reservation);
        // }

        // }

        sc.close();
    }
}
