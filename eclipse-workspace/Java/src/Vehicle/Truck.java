package Vehicle;

public class Truck extends  AbstractVehicle {
	double liters;
	double distance;
	double speed;
	public Truck(String brand,String model,double liters, double distance, double speed) {
		super(brand,model);
		this.liters = liters;
		this.distance = distance;
		this.speed = speed;
	}
	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calculateTravelTime(double km) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}