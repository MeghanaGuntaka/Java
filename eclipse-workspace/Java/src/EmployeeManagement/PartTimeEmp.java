package EmployeeManagement;

public class PartTimeEmp implements Employee {
	float sal;
	PartTimeEmp(float sal){
		this.sal=sal;
		System.out.println("Salary of a part time Employee: "+sal);
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "Part time emp: Sales Dept";
	}

}
