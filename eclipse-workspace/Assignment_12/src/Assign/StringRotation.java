package Assign;

public class StringRotation {

	public static void main(String[] args) {
		String str="StudentTribe";
		int count=2;
		String sub= str.substring(count, str.length());
		String s="";
		for(int i=0;i<count;i++) {
			s+=str.charAt(i);
		}
		System.out.println(s);
		System.out.println(sub+s);
	}

}
