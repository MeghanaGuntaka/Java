package Vehicle;

abstract class abstractVehicle  implements Vehicle{
	String brand;String model;
	abstractVehicle(String brand, String model)
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