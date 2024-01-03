package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Sai");
		al.add('B');
		al.add(true);
		al.add(null);
		al.add(100);
		System.out.println("ArrayList Elements are : "+al);
		ListIterator lt = al.listIterator();
		System.out.println("--forward---");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("--Backward---");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
