package Assessment;

public class Employee {
	double  calculateSalary()
	{
		return 0.0f;
	}
}
class Manager extends Employee{
	double  calculateSalary(double s)
	{
		System.out.println("Manager Salaray: ");
		return s;
	}
}
class Programmer extends Employee{
	double s;
	Programmer(double s)
	{
		this.s=s;
	}
	double  calculateSalary()
	{
		System.out.println("Programmer Salaray: ");
		return s;
	}
	public static void main(String[] a) {
		Programmer p = new Programmer(100000);
		System.out.println(p.calculateSalary());
		Manager m = new Manager();
		System.out.println(m.calculateSalary(2000000));
	}
}