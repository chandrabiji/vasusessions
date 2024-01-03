package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Chandra");
		hs.add('B');
		hs.add(10);
		hs.add(true);
		hs.add(null);
		hs.add(100);
		hs.add(10);
		System.out.println("HashSet Elements are : "+hs);
		HashSet hs1 = new HashSet();
		hs1.add(200);
		hs1.add(300);
		hs.addAll(hs1);
		System.out.println("HashSet Elements are : "+hs);
		System.out.println(hs.contains("Chandra"));
		System.out.println(hs.containsAll(hs1));
	//	hs1.clear();
		System.out.println("After Clear Second HashSet Elements are: "+hs1);
		System.out.println(hs1.isEmpty());
		System.out.println(hs.size());
		hs.remove("Chandra");
		System.out.println(hs.size());
		hs.removeAll(hs1);
		System.out.println("HashSet Elements are : "+hs);
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
