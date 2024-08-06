package EmployeeManagement;

import BankAcc.BankAccount;

public abstract class AbstractEmployee implements BankAccount {
	String empName;
	int empId;
	abstract void claculateSalary();
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

}
