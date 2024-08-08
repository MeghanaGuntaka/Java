package Vehicle;

public abstract class AbstractVehicle  implements Vehicle{
	String brand;String model;
	AbstractVehicle(String brand, String model)
	{
		this.brand=brand;
		this.model=model;
	}
	public String getDetails()
	{
		return brand+model;
	}
	public abstract double calculateFuelEfficiency();
	public abstract double calculateTravelTime(double km);
	
	
}