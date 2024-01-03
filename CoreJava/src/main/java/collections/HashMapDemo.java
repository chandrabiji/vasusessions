package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(200, "pqr");
		hm.put(100, "abc");
		hm.put(300, "xyz");
		hm.put(400, null);
		hm.put(null, "aaa");
		hm.put(null, "nnn");
		System.out.println("HashMap Elements : "+hm);
		System.out.println(hm.get(300));
	    Set<Map.Entry<Integer,String>> entry=hm.entrySet();
	    for(Entry<Integer, String> e:entry) {
	    	System.out.println(e.getKey()+"    "+e.getValue());
	    }

	}

}
