public abstract class Shape
{
  private int sides;
  private boolean isPolygon;
  
  public Shape(int sides, boolean isPolygon)
  {
    this.sides = sides;
    this.isPolygon = isPolygon;
  }
  
  public int getSides()
  {
    return sides;
  }
  
  public boolean isPolygon()
  {
    return isPolygon;
  }
  
  public abstract double calculateArea();
}