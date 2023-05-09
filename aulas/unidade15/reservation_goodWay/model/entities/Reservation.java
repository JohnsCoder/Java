package unidade15.reservation_goodWay.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import unidade15.reservation_goodWay.model.exceptions.DomainException;

public class Reservation {
     private Integer roomNumber;
     private LocalDate checkin;
     private LocalDate checkout;

     public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
          if (checkin.isAfter(checkout)) {
               throw new DomainException("Check-out date must be after check-in date");
          }
          this.roomNumber = roomNumber;
          this.checkin = checkin;
          this.checkout = checkout;
     }

     public Integer getRoomNumber() {
          return roomNumber;
     }

     public void setRoomNumber(Integer roomNumber) {
          this.roomNumber = roomNumber;
     }

     public LocalDate getCheckin() {
          return checkin;
     }

     public void setCheckin(LocalDate checkin) {
          this.checkin = checkin;
     }

     public LocalDate getCheckout() {
          return checkout;
     }

     public void setCheckout(LocalDate checkout) {
          this.checkout = checkout;
     }

     public Integer duration() {
          return (int) Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays();
     }

     public void updateDates(LocalDate checkin, LocalDate checkout) {

          if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
               throw new DomainException("Reservation dates for update must be future dates");

          }
          if (checkin.isAfter(checkout)) {
               throw new DomainException("Check-out date must be after check-in date");
          }

          this.checkin = checkin;
          this.checkout = checkout;

     }

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("Reservation: ");
          sb.append(String.format("Room %d, ", roomNumber));
          sb.append("check-in: " + checkin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", ");
          sb.append("check-out: " + checkin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", ");
          sb.append(duration() + " nights");
          return sb.toString();
     }
}
