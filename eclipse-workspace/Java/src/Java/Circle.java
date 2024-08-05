package Java;

public class Circle implements Shape {
	double radius;
	double pie;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea()
	{
		System.out.println("Area of circle: ");
		System.out.println(pie*(radius*radius));
		return pie*(radius*radius);
	}
	public double calculatePerimeter()
	{
		System.out.println("Perimeter of a circle: ");
		return 2*pie*radius;
	}

}
