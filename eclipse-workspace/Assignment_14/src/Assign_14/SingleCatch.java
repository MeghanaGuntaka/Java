package Assign_14;

public class SingleCatch {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b=10;
		String s=null;
		try {
			System.out.println("Welcome to try block");
			b=b/0;
			if(s==null) {
				System.out.println("null");
			}
			for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
			
			
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException a1){
			System.out.println("You can't divide it by zero!"+a1);
//			System.out.println(a1.getMessage());	
	
		}
		// TODO Auto-generated method stub
		
	}

}
