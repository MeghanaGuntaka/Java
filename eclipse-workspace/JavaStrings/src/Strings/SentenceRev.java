package Strings;
import java.util.*;
public class SentenceRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String[] empty=str.split(" ");
		for(int i=empty.length-1;i>=0;i--) {
			
			System.out.print(empty[i]+" ");
		}
	}

}
