package Assign_14;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		int arr[]= {6 ,4, 2, 3, 9, 2, 7, 2, 1 };
		int arr1[]=new int[arr.length-1];
		int element=2;
		int []newarray=remove(arr,element);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(newarray[i]+" ");
		} 
	}
	public static int[] remove(int arr[],int element){
		int index=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
			index=i;
			break;
		} 
	}
		int arr1[]=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=index)
			{
					arr1[j]=arr[i];
					j++;
		
			}
		}
		return arr1;
	}

}
