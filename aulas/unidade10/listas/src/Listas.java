import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
     public static void main(String[] args) {
          List<String> list = new ArrayList<>();

          list.add("Maria");
          list.add("Alex");
          list.add("Bob");
          list.add("Anna");
          list.add("Carlos");
          list.add("Beto");
          list.add("Charlie");
          list.add("Chris");

          for (String nome : list) {
               System.out.println(nome);
          }

          list.add(2, "João");

          System.out.println(list);

          System.out.println(list.size());

          list.remove("Anna");
          System.out.println(list);

          list.remove(1);
          System.out.println(list);

          list.removeIf(e -> e.charAt(0) == 'M');
          System.out.println(list);

          System.out.println("Index of Bob: " + list.indexOf("Bob"));
          System.out.println("Index of Bob: " + list.indexOf("Marco"));
          List<String> result = list.stream().filter(e -> e.charAt(0) == 'C').collect(Collectors.toList());
          System.out.println(result);


          String name = list.stream().filter(e -> e.charAt(0) == 'B').findFirst().orElse(null);
          System.out.println(name);
     }
}