package ShapeHierarchy;

public class Rectangle implements Shape {
	double length;
	double breadth;
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea()
	{
		System.out.println("Area of rectangle");
		return length*breadth;
	}
	public double calculatePerimeter()
	{
		System.out.println("Perimeter of recatangle: ");
		return 2*(length+breadth);
	}
}
