package mypack;

public class Customer extends Car implements Bank, RangeRover, Vehicle {

	@Override
	public void wheels() {
		System.out.println("4 Wheels");
		// TODO Auto-generated method stub

	}

	@Override
	public void fuelcon() {
		System.out.println("Petrol");
		// TODO Auto-generated method stub

	}

	@Override
	public void color() {
		System.out.println("Black");
		// TODO Auto-generated method stub

	}

	@Override
	public void engineType() {
		Vehicle.super.engine();
		System.out.println("V8");
		// TODO Auto-generated method stub

	}

	@Override
	public void accholder() {
		System.out.println("HDFC");
		// TODO Auto-generated method stub

	}
	public void engine()
	{
		System.out.println("Overeide Engine");
	}

	@Override
	public void vehicleloan() {
		System.out.println("90%");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Vehicle c1 = new Customer();
		c1.engine();
		/*c1.accholder();
		c1.engine();
		c1.engineType();
		c1.test();
		c1.demo();
		c1.fuelcon();
		c1.vehicleloan();*/
		// TODO Auto-generated method stub

	}

}
