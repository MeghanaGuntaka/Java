package ShapeHierarchy;

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c = new Circle(23.0);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		Rectangle r = new Rectangle(34,43);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		// TODO Auto-generated method stub

	}

}
