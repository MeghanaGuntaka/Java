package Assign;

public class RepeatingChar {

	public static void main(String[] args) {
		String s="studenttribestudenttribe";
		char c[]=s.toCharArray();
		int count[]=new int[c.length];
		int v=0;
//		int temp=0;
		int maxcount=0;
		char repeat=' '; 
		for(int i=0;i<c.length;i++) {
			v=0; 
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j])
				{
					v++;
				}
//				if	v=count[i]
				if(v>maxcount)
				{
					maxcount=v;
					repeat=c[i];
				}
				
					
			}
		}
		System.out.println(repeat +" "+ maxcount);
		
		// TODO Auto-generated method stub

	}

}
