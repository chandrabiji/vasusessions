package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Vector v = new Vector();
		System.out.println("Array Elements are:");
		for(int k:arr) {
			System.out.println(k);
		}
		for(int i=0;i<arr.length;++i) {
			v.add(arr[i]);
		}
		System.out.println("Vector Elements are");
		for(int i=0;i<v.size();++i) {
			System.out.println(v.get(i));
		}
		System.out.println("--Enumeration---");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
