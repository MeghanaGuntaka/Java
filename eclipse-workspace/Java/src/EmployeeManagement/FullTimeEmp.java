package EmployeeManagement;

public class FullTimeEmp implements Employee {
	float salary;
	FullTimeEmp(float salary){
		this.salary=salary;
		System.out.println("Salary of a Full-time Salary: "+salary);
	}
	@Override
	public double calculateSalary() {
	
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "Full Time Emp: TechincalDept";
	}

}
