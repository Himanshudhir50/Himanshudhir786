
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle
{
   private double side;
   
   public Square(double side) {
       super(side, "Square");
       //setType("Square");
       this.side = side;
    }
    
   public double getSide()
   {
       return side;
   }
       
   @Override
   public void draw()
   {
       super.draw();
       //System.out.println("Drawing " + getType() + "Hello");
    }
   
   @Override
   public String toString()  {
       return super.toString() + "\tside: " + getSide() + "\n";
    }
}
    
   


   
 