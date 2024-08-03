package mypack;

public interface Vehicle {
	void wheels();
	void fuelcon();
	default void engine()
	{
		System.out.println("Engine");
	}

}
