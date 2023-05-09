
import java.util.Scanner;

public class bitwiseOperator {
     public static void main(String[] args) {
          int byteString = 89;
          int byteString2 = 60;
          System.out.println(byteString & byteString2);
          System.out.println(byteString | byteString2);
          System.out.println(byteString ^ byteString2);

          Scanner sc = new Scanner(System.in);

          int mask = 0b100000;
          int n = sc.nextInt();
          sc.close();
          if ((n & mask) != 0) {
               System.out.println("gth bit is true!");
          } else {
               System.out.println("6th bit is false!");
          }





     }
}
