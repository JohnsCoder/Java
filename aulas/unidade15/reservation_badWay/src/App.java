import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import unidade15.reservation_badWay.models.entities.Reservation;

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

            String error = reservation.updateDates(updatedCheckinDate, updatedCheckoutDate);

            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println(reservation);
            }

        }

        sc.close();
    }
}
