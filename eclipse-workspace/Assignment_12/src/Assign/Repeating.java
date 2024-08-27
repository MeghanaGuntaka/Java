package Assign;

public class Repeating {

	public static void main(String[] args) {
		String str="studenttribestudenttribe";
		int count=0;
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j])
					count++;
			}
			
		}
		
		
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
