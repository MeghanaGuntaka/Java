package Strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String empty="";
		for(int i=str.length()-1;i>=0;i--) {
			empty+=str.charAt(i);
		}
		if(empty.equals(str))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");
		// TODO Auto-generated method stub

	}

}
