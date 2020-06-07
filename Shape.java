
import java.text.DecimalFormat;
import java.util.Comparator;

public abstract class Shape
     implements Drawable<Shape>, Comparable<Shape>, Comparator<Shape>
{
    private double area;
    private double perimeter;
    private String type;
    protected static final DecimalFormat df =
         new DecimalFormat("#, ##0.##");
         
    public Shape(String type, double area, double perimeter) {
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }
    
    // public Shape()
    // {
    // }
    
    // protected void setType(String type) {
        // this.type = type;
    // }
    
    // protected void setArea(double area) {
        // this.area = area;
    // }
    
    // protected void setPerimeter(double perimeter) {
        // this.perimeter = perimeter;
    // }
    
    public String getType() {
        return type;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    @Override
    public int compareTo(Shape other) {
        return new Double(this.getArea())
        .compareTo(new Double(other.getArea()));
    }
    
     public String baseString() {
        return "Shape type: " + getType() + "\n" +
               "/t" + "area: " + df.format(getArea()) + "\n" +
               "/t" + "perimeter: " + df.format(getPerimeter()) + "\n";
           
    }
    
    //public abstract void draw();
    
    @Override
    public String toString() {
        return baseString();
    }
    
   @Override
    public int compare(Shape x, Shape y) {
        Double xP = new Double(x.getPerimeter());
        Double yP = new Double(y.getPerimeter());
        return xP.compareTo(yP);
    }
}