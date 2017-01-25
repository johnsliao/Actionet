import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShapesTest {
  @Test
  public void TestTriangleArea() {
    Triangle t = new Triangle(3,2);
    double a = t.getArea();
    assertEquals(3.0, a, 0.0f);
  }
  
  @Test
  public void TestTrianglePerimeter() {
    Triangle t = new Triangle(3,2);
    double a = t.getPerimeter();
    assertEquals(9.0, a, 0.0f);
  }
  
  @Test
  public void TestRectangleArea() {
    Rectangle r = new Rectangle(3,2);
    double a = r.getArea();
    assertEquals(6.0, a, 0.0f);
  }
  
  @Test
  public void TestRectanglePerimeter() {
    Rectangle r = new Rectangle(3,2);
    double a = r.getPerimeter();
    assertEquals(10.0, a, 0.0f);
  }
  
  @Test
  public void TestCircleArea() {
    Circle c = new Circle(3);
    double a = c.getArea();
    assertEquals(Math.pow(3, 2)*Math.PI, a, 0.0f);
  }
  
  @Test
  public void TestCirclePerimeter() {
    Circle c = new Circle(3);
    double a = c.getPerimeter();
    assertEquals(6*Math.PI, a, 0.0f);
  }
  
  @Test
  public void TestEllipseArea() {
    Ellipse c = new Ellipse(3,2);
    double a = c.getArea();
    assertEquals(Math.PI * 3 * 2, a, 0.0f);
  }
  
  @Test
  public void TestEllipsePerimeter() {
    Ellipse c = new Ellipse(3,2);
    double a = c.getPerimeter();
    assertEquals(2 * Math.PI * Math.sqrt((Math.pow(3,2)+Math.pow(2,2))/2), a, 0.0f);
  }
 
  @Test
  public void TestSquareArea() {
    Square c = new Square(3);
    double a = c.getArea();
    assertEquals(Math.pow(3,2), a, 0.0f);
  }
  
  @Test
  public void TestSquarePerimeter() {
    Square c = new Square(3);
    double a = c.getPerimeter();
    assertEquals(3*4, a, 0.0f);
  }
  
  @Test
  public void TestQuadrilateralArea() {
    Quadrilateral c = new Quadrilateral(3,2);
    double a = c.getArea();
    assertEquals(3*2, a, 0.0f);
  }
  
  @Test
  public void TestQuadrilateralPerimeter() {
    Quadrilateral c = new Quadrilateral(3,2);
    double a = c.getPerimeter();
    assertEquals(2*(3+2), a, 0.0f);
  }
  
}
