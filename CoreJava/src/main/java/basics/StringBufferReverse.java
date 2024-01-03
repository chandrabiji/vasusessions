package basics;

import java.util.Scanner;

public class StringBufferReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String ?");
		StringBuffer sb = new StringBuffer(sc.next());
		System.out.println("Original Input String = "+sb);
		System.out.println("Reverse String = "+sb.reverse());

	}

}
