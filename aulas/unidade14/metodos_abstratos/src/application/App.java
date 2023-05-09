import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       List<Shape> shapes = new ArrayList<>();
       System.out.print("Enter the number of shapes: ");
       int shapesCount = sc.nextInt();
       for (int i = 0; i < shapesCount; i++) {
        sc.nextLine();
        System.out.printf("%nShape #%d data:%n", i +1);
        System.out.print("Rectangle or Circle (r/c)? ");
        char whichShape = sc.nextLine().charAt(0);
        System.out.print("Color (BLACK/BLUE/RED): ");
        Color color = Color.valueOf(sc.nextLine());
        switch(whichShape) {
            case 'r':
            System.out.print("Width: ");
            Double width = sc.nextDouble();
            System.out.print("Height: ");
            Double height = sc.nextDouble();
            shapes.add(new Rectangle(color, width, height));
            break;
            case 'c':
            System.out.print("Radius: ");
            double radius = sc.nextDouble();
            shapes.add(new Circle(color, radius));
        }

       }

       System.out.println("\nSHAPE AREAS: ");
       for (Shape s: shapes) {
        System.out.println(String.format("%.2f", s.area()));
       }
       sc.close();
    }
}
