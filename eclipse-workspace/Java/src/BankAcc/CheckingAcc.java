package BankAcc;

public class CheckingAcc implements BankAccount {
	double p;
	int t;
	double r;
	CheckingAcc(double p,int t, double r){
		
	}

	@Override
	public double calculateInterest() {
		System.out.println("Interest rate of checking account: ");
		double i=(p*t*r);
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "checkingAccount";
	}

}
