package Strings;
import java.util.*;
public class Duplicates {
	public static void main(String[] args) {
		String emp=" "; 
		String s="googlego";
		for(int i=0;i<s.length();i++) {
			int count=0;
			//char a[]=s.toCharArray();
			for(int j=i+1;j<s.length();j++) {
			if((s.charAt(i)==s.charAt(j))) 
				{
						count++;
					//break;
					//emp+=emp.concat(s);
//					System.out.println(a[i]);
//					break;
				}	
				
			}
			if(count>1) 
				emp+=s.charAt(i);
				//else
				//	break;
		}
		System.out.println(emp);	
	}

}
