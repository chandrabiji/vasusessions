package com.chandra.pms.main;

import java.util.Scanner;

import com.chandra.pms.menus.ProductDetails;

public class ProductManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("|    PRODUCT MANAGEMENT SYSTEM  |");
			System.out.println("---------------------------------");
			System.out.println("|   1. ADMIN                    |");
			System.out.println("|   2. CUSTOMER                 |");
			System.out.println("|   3. EXIT                     |");
			System.out.println("---------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ProductDetails.adminMenu();
				break;
			case 2:
				ProductDetails.customerMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select Your choice range 1-3 only");
			}
		}

	}

}
