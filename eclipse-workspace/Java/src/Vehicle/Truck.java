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
	public double calculateFuelEfficiency() 
	{
		System.out.println("FuelEfficiency of a truck");
		return liters/distance*100;
	}
	@Override
	public double calculateTravelTime(double distance) {
		System.out.println("TravelTime of a truck");
		return distance/speed;
	} 

}