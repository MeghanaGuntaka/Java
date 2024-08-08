package Vehicle;

public class Car  extends AbstractVehicle{
	double litres;
	double distance;
	double speed;
	public Car(String brand,String model,double liters,double distance,double speed) 
	{
		super(brand,model);
		this.litres=liters;
		this.distance=distance;
		this.speed=speed;
	}
	@Override
	public double calculateFuelEfficiency() 
	{
		System.out.println("FuelEfficiency of a car");
		return litres/distance*100;
	}
	@Override
	public double calculateTravelTime(double distance) 
	{
		System.out.println("TravelTime of a car");
		return distance/speed;
	} 

}
