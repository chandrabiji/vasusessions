package controlls;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("A value is big");
		}else {
			System.out.println("B value is big");
		}

	}

}
