package data_hora.src.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instancias {
     public static void main(String[] args) {

          // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html

          LocalDate d01 = LocalDate.now();
          LocalDateTime d02 = LocalDateTime.now();
          Instant d03 = Instant.now();
          
          LocalDate d04 = LocalDate.parse("2022-07-20");
          LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
          Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
          Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

          DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

          LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
          LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

          LocalDate d10 = LocalDate.of(2022, 07, 20);
          LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30 );
          
          System.out.println("LocalDate = " + d01);
          System.out.println("LocalDateTime = " + d02);
          System.out.println("GlobalDateTime = " + d03);

          System.out.println("LocalDate (gerado apartir de string) = " + d04);
          System.out.println("LocalDateTime (gerado apartir de string) = " + d05);
          System.out.println("GlobalDateTime (gerado apartir de string) = " + d06);
          System.out.println("GlobalDateTime (gerado apartir de string) (com fuso-horario) = " + d07);
          System.out.println("LocalDate (gerado apartir de string customizada) = " + d08);
          System.out.println("LocalDateTime (gerado apartir de string customizada) = " + d09);
          System.out.println("LocalDate (gerado apartir de valores isolados) = " + d10);
          System.out.println("LocalDateTime (gerado apartir de valores isolados) = " + d11);


     }

}
