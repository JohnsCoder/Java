package data_hora.src.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Convercoes {
     public static void main(String[] args) {
          
          LocalDate d01 = LocalDate.parse("2022-07-20");
          LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
          Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
     
          LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
          LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
          LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
          LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

          System.out.println("LocalDate to GlobalDate (horario da maquina) = " + r1);
          System.out.println("LocalDate to GlobalDate (horario de portugal) = " + r2);
          
          System.out.println("LocalDateTime to GlobalDate (horario da maquina) = " + r3);
          System.out.println("LocalDateTime to GlobalDate (horario de portugal) = " + r4);

          System.out.println("Dia da LocalDate = " + d01.getDayOfMonth());
          System.out.println("Mes da LocalDate = " + d01.getMonthValue());
          System.out.println("Ano da LocalDate = " + d01.getYear());

          System.out.println("Hora da LocalDateTime = " + d02.getHour());
          System.out.println("Minuto da LocalDateTime = " + d02.getMinute());
          System.out.println("Segundo da LocalDateTime = " + d02.getSecond());
   


     }
}
