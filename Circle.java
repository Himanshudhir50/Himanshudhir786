
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
   private double radius;
   
   private static final String TYPE = "Circle";
   
   public Circle(double radius) {
       super(TYPE, Math.PI * radius * radius, calcCirclePerimeter(radius));
      // setType("Circle");
       this.radius = radius;
       //setArea(Math.PI * radius * radius);
       //setPerimeter(2 * Math.PI * radius);
    }
    
   private static double calcCirclePerimeter(double radius) {
       return 2 * Math.PI * radius;
    }
    
   public double getRadius()
   {
       return radius;
   }
    
   @Override
   public void draw()
   {
       System.out.println("Drawing " + getType() + "Hello");
    }
   
   @Override
   public String toString()  {
       return super.toString() + "\tradius: " + getRadius() + "\n";
    }
}

   
 