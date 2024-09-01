package Assign_13;

public class PrimeNum {

	public static void main(String[] args) {
		int arr[]= {4,2,7,9,11,18,20};
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=2;j<=arr[i]/2;j++)
			{
				if(arr[i]%2 ==0)
				{
					flag =false;
					break;
				}
			}
				if(flag) {
					System.out.print(arr[i]+" ");
				}
			}
	}


}
