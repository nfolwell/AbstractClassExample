public class Rectangle extends Shape
{
  private int length;
  private int width;
  
  public Rectangle(int length, int width)
  {
    super(4, true);
    this.length = length;
    this.width = width;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public double calculateArea()
  {
    return (length * width);
  }
}