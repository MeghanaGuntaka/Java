package Assign;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		int a1[]= {1,5,3,4,2};
		int a2[]= {9,7,6,8,10};
		int temp=0;
		int arr[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			arr[i]=a1[i];
		}
		for(int j=0;j<a2.length;j++) {
//			System.out.println(n);
			arr[a1.length+j]=a2[j];
			//System.out.print(arr[n]+" ");
		}
//		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
