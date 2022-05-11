public class Triangle extends Shape
{
  private int base;
  private int height;
  
  public Triangle(int base, int height)
  {
    super(3, true);
    this.base = base;
    this.height = height;
  }
  
  public int getBase()
  {
    return base;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  public double calculateArea()
  {
    return (0.5 * base * height);
  }
}