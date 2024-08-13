package Bank;

public abstract class BankAcc implements BankDetails {
	public abstract void deposit();
	public abstract  void withdraw();
}
//class SavingsAcc extends BankAcc{
//		public void deposit()
//		{
//			System.out.println("Deposit from savings account: ");
//		
//			
//		}
//		public void withdraw()
//		{
//			System.out.println("Withdraw from Savings account");
//		
//		}
//	}
//	class CurrentAcc extends SavingsAcc{
//		public void deposit()
//		{
//			System.out.println("Deposit from Current account: ");
//		}
//		public void withdraw()
//		{
//			System.out.println("Withdraw from Current account");
//		}
//		public static void main(String[] a)
//		{
//			CurrentAcc c = new CurrentAcc();
//			SavingsAcc s = new SavingsAcc();
//			c.deposit();
//			c.withdraw();
//			s.deposit();
//			s.withdraw();
//		}
//		
//	}
//
//
//}
