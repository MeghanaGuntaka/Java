package ShapeHierarchy;

public class Circle implements Shape {
	double radius;
	double pie=3.14;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea()
	{
		System.out.println("Area of circle: ");
		return pie*(radius*radius);
	}
	public double calculatePerimeter()
	{
		System.out.println("Perimeter of a circle: ");
		return 2*pie*radius;
	}

}
