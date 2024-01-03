package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("abc");
		ts.add("xyz");
		ts.add("pqr");
		//ts.add(null);
		ts.add(100);
		System.out.println("TreeSet Elements are : "+ts);
	}

}
