public class PackingUnpackingWrapperClasses {
     public static void main(String[] args) {
          // sem wrapper classes
          int x1 = 20;
          // packing
          Object obj = x1;

         //unpacking
          int x2 = (int) obj;


          // com wrapper classes
          int y1 = 20;

          //packing
          Integer obj2 = y1;

          //unpacking
          int y2 = obj2;

          System.out.println(x2 + y2);
     }
}
