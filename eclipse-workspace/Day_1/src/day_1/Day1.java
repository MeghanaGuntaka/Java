package day_1;

public class Day1 {

	public static void main(String[] args) {
		int sum=0;
		int rem=0;
		int k=6;
		int count=0;
		int a1[]= {11,3,456,5,6,54,5};
		for(int i=0;i<a1.length;i++) {
			while(a1[i]!=0) {
				rem+=a1[i]%10;
				a1[i]=a1[i]/10;
				sum=sum+rem;
//				if(k==)
			}
			
		}
		// TODO Auto-generated method stub
		System.out.println(sum);
	}

}
