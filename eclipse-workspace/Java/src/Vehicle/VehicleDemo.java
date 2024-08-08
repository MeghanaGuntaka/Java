package Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c = new Car("XUV","700",5,20,42);
		Truck t = new Truck("Tata","Truck",20,40,400);
		System.out.println(c.calculateFuelEfficiency());
		System.out.println(t.calculateTravelTime(20));
		
		// TODO Auto-generated method stub

	}

}
