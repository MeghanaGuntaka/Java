package ShapeHierarchy;

public interface Shape {
	
	double calculateArea();
	double calculatePerimeter();

}
abstract class AbstractShape 
{
	String color;
	abstract void getColor();
	public double calculateArea()
	{
		System.out.println("Area");
		return 0.0d;
	}
	public double calculatePerimeter()
	{
		System.out.println("Perimeter");
		return 0.0d;
		
	}
}
