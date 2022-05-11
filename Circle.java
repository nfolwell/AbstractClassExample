public class Circle extends Shape
{
  private int radius;
  
  public Circle(int radius)
  {
    super(1, false);
    this.radius = radius;
  }
  
  public int getRadius()
  {
    return radius;
  }
  
  public double calculateArea()
  {
    return (Math.PI * radius * radius);
  }
}