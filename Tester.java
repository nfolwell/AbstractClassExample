public class Tester
{
  public static void main(String[] args)
  {
    Triangle tri = new Triangle(10, 25);
    System.out.println(tri.calculateArea());
    
    Rectangle rect = new Rectangle(20, 30);
    System.out.println(rect.calculateArea());
    
    Circle circle = new Circle(10);
    System.out.println(circle.calculateArea());
    
  //  Shape shape = new Shape(8, true);
  }
}