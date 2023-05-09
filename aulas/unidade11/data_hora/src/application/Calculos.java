package unidade11.data_hora.src.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
     public static void main(String[] args) {
          LocalDate d01 = LocalDate.parse("2022-07-20");
          LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
          Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

          LocalDate pastWeekLocalDate = d01.minusDays(7);
          LocalDate nextWeekLocalDate = d01.plusDays(7);

          LocalDateTime pastHoursLocalDateTime = d02.minusHours(7);
          LocalDateTime nextHoursLocalDateTime = d02.plusHours(7);

          Instant pastSecoundsInstant = d03.minus(7, ChronoUnit.SECONDS);
          Instant nextSecoundsInstant = d03.plus(7, ChronoUnit.SECONDS);

          System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
          System.out.println("pastWeekLocalDate = " + nextWeekLocalDate);

          System.out.println("pastHoursLocalDateTime = " + pastHoursLocalDateTime);
          System.out.println("nextHoursLocalDateTime = " + nextHoursLocalDateTime);

          System.out.println("pastSecoundsInstant = " + pastSecoundsInstant);
          System.out.println("nextSecoundsInstant = " + nextSecoundsInstant);

          Duration t1 = Duration.between(pastHoursLocalDateTime, nextHoursLocalDateTime);
          Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), nextWeekLocalDate.atTime(0, 0));
          Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
          Duration t4 = Duration.between(nextSecoundsInstant, pastSecoundsInstant);

          System.out.println("Diferrence between hours = " + t1.toHours());
          System.out.println("Diferrence between days = " + t2.toDays());
          System.out.println("Diferrence between days = " + t3.toDays());
          System.out.println("Diferrence between secounds = " + t4.toSeconds());

     }
}
