package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Sekhar");
		lhs.add(100);
		lhs.add(false);
		lhs.add(null);
		lhs.add(99.99);
		lhs.add(100);
		lhs.add('B');
		System.out.println("LinkedHashSet Elements : "+lhs);

	}

}
