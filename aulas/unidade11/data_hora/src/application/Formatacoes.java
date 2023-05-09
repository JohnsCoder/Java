package unidade11.data_hora.src.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacoes {
     public static void main(String[] args) {
          LocalDate d01 = LocalDate.parse("2022-07-20");
          LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
          Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

          DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
          DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
          DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
          DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

          System.out.println("LocalDate to string = " + d01.format(fmt1));
          System.out.println("LocalDate to string = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
          System.out.println("LocalDate to string = " + fmt1.format(d01));

          System.out.println("LocalDateTime to string = " + d02.format(fmt2));

          System.out.println("GlobalDateTime to string = " + d02.format(fmt4));

          System.out.println("GlobalDateTime to string = " + fmt3.format(d03));
          System.out.println("GlobalDateTime to string = " + fmt5.format(d03));

     }
}
