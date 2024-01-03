package controlls;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("|        Operations         |");
		System.out.println("-----------------------------");
		System.out.println("|     1. Addition           |");
		System.out.println("|     2. Subtract           |");
		System.out.println("|     3. Exit               |");
		System.out.println("-----------------------------");
		System.out.println("Select your choice ?");
		int choice = sc.nextInt();
		System.out.println("Enter A,B values ?");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Addition value = "+(a+b));
		        break;
		case 2: System.out.println("Subtract value = "+(a-b));
		        break;
		case 3:System.exit(0);
		       break;
		default:System.out.println("Please select your choice range 1 - 3 only");       
		}

	}

}
