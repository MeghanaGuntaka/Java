package Strings;
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char empty=' ';
		String s = sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
			//System.out.println(s.charAt(i));
			
		}
		
		System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
