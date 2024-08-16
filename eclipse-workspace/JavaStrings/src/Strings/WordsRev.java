package Strings;
import java.util.*;
public class WordsRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "This is java";
		String empty="";
		//String e1="";
		String[] a=s.split(" ");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) 
		{
			String e1=a[i];
			String e2="";
			for(int j=e1.length()-1;j>=0;j--) {
				e2+=e1.charAt(j);
				//System.out.println(a[j]);
			}
			empty=empty+e2+" ";
			
		}
		System.out.println(empty);
	}

}
