package Assign_14;

public class SumOfDiagnoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,2,3}, 
                {4,5,6}, 
                {7,8,9}}; 
		int n = arr.length;
//		System.out.println(n);
		int primary = 0;
		int secondary = 0;
		for(int i = 0; i < n; i++) {
			primary += arr[i][i];
			secondary += arr[i][n - 1 -i];
		}
		System.out.println("First diagnoal " + primary);
		System.out.println("Second diagonal: " + secondary);

	}

}
