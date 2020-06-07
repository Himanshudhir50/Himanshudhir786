
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
   private double length;
   private double width;
   public Rectangle(double length, double width) {
       super("Rectangle", length * width, 2 * (length + width));
       //setType("Rectangle");
       this.length = length;
       this.width = width;
       //setArea(length * width);
       //setPerimeter(2 * (length + width));
    }
    
   protected Rectangle(double side, String type) {
       super(type, side * side, side * 4);
    }
    
   public double getLength()
   {
       return length;
   }
    
    public double getWidth()
   {
       return width;
   }
   
   @Override
   public void draw()
   {
       System.out.println("Drawing " + getType() + "Hello");
    }
   
   @Override
   public String toString()  {
       return super.toString() + "\tlength: " + getLength() + "\n" +
                                  "\twidth: " + getWidth() + "\n";
    }
    
    
}

   
 