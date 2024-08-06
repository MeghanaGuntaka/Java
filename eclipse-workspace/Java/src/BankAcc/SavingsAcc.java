package BankAcc;

public class SavingsAcc implements BankAccount 
{
	int p;
	int t;
	double r;
	SavingsAcc(int p,int t, double r){
		this.p=p;
		this.r=r;
		this.t=t;
	}

	@Override
	public double calculateInterest() {
		System.out.println("Interest rate of Savings account: ");
		double i=(p*t*r);
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "Savings";
	}

}
