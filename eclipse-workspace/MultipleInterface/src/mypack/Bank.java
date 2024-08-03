package mypack;

public interface Bank {
	void accholder();
	void vehicleloan();
	default void test()
	{
		System.out.println("4 Wheelers");
	}

}
