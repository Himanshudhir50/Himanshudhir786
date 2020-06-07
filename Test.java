
import java.util.*;
import static java.lang.System.out;
/**
 * Convert -15 to eight bit two's complement
 * convert 15 to binary 00001111 (repeated divide by 2....)
 * Flip the bits        11110000
 * Add one              11110001
 */
public class Test

{
    public static void main(String[] args) {
        Shape[] shapesObjects = {
            new Circle(12.5),
            new Rectangle(7,6),
            new Circle(2.5),
            new Square(4),
        };
        
        List<Shape> shapes = new ArrayList(Arrays.asList(shapesObjects));
        
        for (Shape s : shapes) {
            System.out.println(s);
        }
        
        shapes.forEach(shape -> shape.draw());
        
        out.println("\n==== Sort by perimeter ====");
        shapes.stream()
                       .sorted((x,y) -> x.compare(x,y))  
                       .forEach(System.out::println);
                       
        shapes.add(0, new Square(45));
        
        System.out.println("\n==== Sort by Area ====");
        Collections.sort(shapes);
        shapes.forEach(System.out::println);
        
        filterPrint(shapes, "Circle");
    }
    
    public static void filterPrint(List<Shape> shapes, String type) {
        System.out.println("\n==== Filtered: " + "  ====" );
        shapes.stream()
                      .filter(shape -> shape.getType().equals(type))
                      .forEach(System.out::println);  
                    }
                }
                
        