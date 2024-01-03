package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(200, "pqr");
		hm.put(100, "abc");
		hm.put(300, "xyz");
		//hm.put(400, null);
		//hm.put(null, "aaa");
		System.out.println("Hashtable Elements : "+hm);
		System.out.println(hm.get(300));
	    Set<Map.Entry<Integer,String>> entry=hm.entrySet();
	    for(Entry<Integer, String> e:entry) {
	    	System.out.println(e.getKey()+"    "+e.getValue());
	    }

	}

}
