package StringDemo;
import java.util.*;
public class StringRev {
	static char[] c;
	static String empty="";
	static String str="Meghana";
	public static void main(String[] a) {
		for(int i=str.length()-1;i>=0;i--) {
			empty+=str.charAt(i);
//			empty=c;
			c=str.toCharArray();
			System.out.println(str.charAt(i));
			
		}
		
		System.out.println(empty);
		
	}

}
