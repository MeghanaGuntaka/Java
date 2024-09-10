package CollectionDemo;
import java.util.*;
public class HashDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "Meghana");
		hm.put(2, "Reddy");
		hm.put(3, "Guntaka");
//		hm.put(null, null);
		hm.put(null, "empty");
		hm.put(4, "HEllo");
		hm.put(4, null);
//		System.out.println(hm);
//		Set<Integer> s = hm.keySet();  //keyset retrives the key values as a set
//		Iterator<Integer> itr =s.iterator();
//		while(itr.hasNext()) {
//			Integer i=itr.next();
//			System.out.println("The key is "+i+" and the value is "+hm.get(i));
//		}
		Set<Map.Entry<Integer, String>> s1=hm.entrySet(); //Map.Entry creates a reference of <key,value> pair
		Iterator<Map.Entry<Integer,String>> itr1 = s1.iterator();
//		while(itr1.hasNext()) {
//			Map.Entry<Integer, String> m=itr1.next();
//			System.out.println(m);
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		for(Map.Entry<Integer, String> s:hm.entrySet()) {
			System.out.println(s.getValue());
		}
	}

}
