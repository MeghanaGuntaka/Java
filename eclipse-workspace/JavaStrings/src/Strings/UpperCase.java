package Strings;
import java.util.*;
public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split(" ");
		for(String w : s)
		{
			for(int i=0;i<w.length();i++)
			{
				if((w.charAt(i)>65)  && (w.charAt(0)<92))
				{
					System.out.print(w + " ");
					break;
				}
				
				
			}
		}


	}

}
