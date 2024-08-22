package ArraysDemo;

public class Triplets {

	public static void main(String[] args) {
		int arr[] = {5,2,3,8,9,1,4,6};
		int sum=10;
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				for(int k=j+1;k<arr.length;k++) 
				{
					s=arr[i]+arr[j]+arr[k];
					if(sum==s)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						break;
					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
