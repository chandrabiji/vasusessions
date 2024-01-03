package controlls;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A,B and C values ?");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("A value is big");
		}else if(b>a && b>c) {
			System.out.println("B value is big");
		}else if(c>a && c>b){
			System.out.println("C value is big");
		}else {
			System.out.println("All are equals or else two are equals");
		}

	}

}
