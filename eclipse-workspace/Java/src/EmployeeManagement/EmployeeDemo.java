package EmployeeManagement;

public class EmployeeDemo {

	public static void main(String[] args) {
		FullTimeEmp f = new FullTimeEmp(20000); 
		PartTimeEmp p = new PartTimeEmp(2000);
		System.out.println(f.getDepartment());
		System.out.println(p.getDepartment());
		// TODO Auto-generated method stub

	}

}
