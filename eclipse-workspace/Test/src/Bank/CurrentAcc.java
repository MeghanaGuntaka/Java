package Bank;

public class CurrentAcc  implements BankDetails
{

	public void deposit() {
		System.out.println("Deposit from your Current Account: ");
		
	}
	
	public void withdraw() {
		System.out.println("Withdraw from your Current Account: ");

	}

	public static void main(String[] args) {
		SavingsAccc s = new SavingsAccc();
		s.deposit();
		s.withdraw();
		CurrentAcc c = new CurrentAcc();
		c.deposit();
		c.withdraw();
		// TODO Auto-generated method stub

	}

}
