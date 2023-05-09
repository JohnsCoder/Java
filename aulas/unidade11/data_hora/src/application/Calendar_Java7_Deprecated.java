package data_hora.src.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Java7_Deprecated {
     public static void main(String[] args) {

          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

          Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

          System.out.println(sdf.format(d));

          Calendar cal = Calendar.getInstance();
          cal.setTime(d);
          cal.add(Calendar.HOUR_OF_DAY, 4);
          d = cal.getTime();
          System.out.println(sdf.format(d));
          
          
          int minutes = cal.get(Calendar.MINUTE);
          int mounth = 1 + cal.get(Calendar.MONTH);
          System.out.println("Minutes = " + minutes);
          System.out.println("Mounth = " + mounth);


     }
}
