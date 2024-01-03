package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Charan");
		ll.add('B');
		ll.add(true);
		ll.add(null);
		ll.add(10);
		ll.add(99.99);
		System.out.println("LinkedList Elements are: "+ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println("LinkedList Elements are: "+ll);
		Iterator it = ll.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
