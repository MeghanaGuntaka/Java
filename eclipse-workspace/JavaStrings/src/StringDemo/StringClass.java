package StringDemo;
import java.util.*;
public class StringClass {
	static int count=0;
	static int index2=0;
	static char c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String s1 = "Meghana";
		String s2 ="Meghana";
		String obj = new String("Meghana");
		String obj1 = new String("Meghana");
		System.out.println(obj1==obj);
		//System.out.println(str.length());
		int index1=str.indexOf("e");//indexOf return type is int
		for(int i=1;i<str.length();i++) 
		{
			c=str.charAt(i);
			if(c=='e')
				count++;
			
		}
		System.out.println(count);
		System.out.println(str.charAt(0));
		// TODO Auto-generated method stub

	}

}
