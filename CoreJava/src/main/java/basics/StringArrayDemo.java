package basics;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array Size ?");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter String Array Elements ?");
		for(int i=0;i<size;++i) {
			arr[i]=sc.next();
		}
		System.out.println("without sorting string array elements");
		for(String name:arr) {
			System.out.println(name);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting String Array Elements");
		for(String name:arr) {
			System.out.println(name+" - "+name.length());
		}

	}

}
