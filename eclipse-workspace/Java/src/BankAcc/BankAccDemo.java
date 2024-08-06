package BankAcc;

public class BankAccDemo extends AbstractBankAccoun {
	
	public static void main(String[] args) {
		SavingsAcc s= new SavingsAcc(10,2,0.3);
		CheckingAcc c = new CheckingAcc(100,2,0.4);
		BankAccDemo b = new BankAccDemo();
		b.getDetails();
		System.out.println(s.calculateInterest());
		System.out.println(s.getAccountType());
		System.out.println(c.calculateInterest());
		System.out.println(c.getAccountType());
		// TODO Auto-generated method stub

	}

}
