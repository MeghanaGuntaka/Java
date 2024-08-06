package BankAcc;

public abstract class AbstractBankAccoun implements BankAccount {
	int accNumber=92921349;
	float balance=10000;
	 void getDetails()
	 {
		 System.out.println("Account Details: ");
		 System.out.println("Account Number: "+accNumber);
		 System.out.println("Account Balance: "+balance);
		 return ;
	 }
	
	public double calculateInterest() {
		System.out.println("Interest");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

}
