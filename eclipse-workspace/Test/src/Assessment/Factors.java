package Assessment;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//taking the input
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) //logic for finding factors
				System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
