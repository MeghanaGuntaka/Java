package ArraysDemo;

public class Rem {
	public static void main(String[] args) {
		int a1[]= {3,5,10,9,17};
		int a2[]= {2,6,8,4,5};
//		int rem[]= new int[a1.length];
		int rem=0;
		for(int i=0;i<a1.length;i++) {
			rem+=a1[i]%a2[i];
//			rem+=rem;
//			System.out.println(rem);
			
		}
		// TODO Auto-generated method stub
		System.out.println(rem);
	}

}
