package StringTrans;

public class Convertion {
	
	public static void main(String[] a) {
		StringTransformer upper_Case = (String str)->str.toUpperCase();
		StringTransformer rev =(String str)->{
			String empty=" ";
			for(int i=str.length()-1;i>=0;i--) {
				empty+=str.charAt(i);
				
			}
			//System.out.println(empty);
			return empty;
		};
		StringTransformer len=(String str)->{
			int i=str.length();
			return i+"";
		};
		Convertion c = new Convertion();
		System.out.println("UpperCase: "+ upper_Case.transform("Meghana"));
		System.out.println("Resverse: "+rev.transform("PAllav"));
		System.out.println("Length: "+len.transform("Meghana"));
		
	}

}
