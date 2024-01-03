package basics;

import java.util.Scanner;

public class StringReverse {
	//instance method
	public String reverse(String str) {
		String reObj = "";
		for(int i=str.length()-1;i>=0;--i) {
			reObj +=str.charAt(i);
		}
		return reObj;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String str = sc.next();
		StringReverse sr = new StringReverse();
		String reverse = sr.reverse(str);
		System.out.println("Original String = "+str);
		System.out.println("Reverse String = "+reverse);
		

	}

}
