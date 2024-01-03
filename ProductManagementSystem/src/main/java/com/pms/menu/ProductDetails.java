package com.pms.menu;

import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.dao.ProductDAOImpl;
import com.pms.model.Product;

public class ProductDetails {

	static Scanner sc = new Scanner(System.in);
	static ProductDAO dao = new ProductDAOImpl();

	public static void adminMenu() {
		System.out.println("------------------------------");
		System.out.println("|      ADMIN MAIN MENU       |");
		System.out.println("------------------------------");
		System.out.println("|    1. Add Product          |");
		System.out.println("|    2. View Product         |");
		System.out.println("|    3. View All Products");
		System.out.println("|    4. Update Product       |");
		System.out.println("|    5. Delete Product       |");
		System.out.println("|    6. Back                 |");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dao.addProduct();
			adminMenu();
			break;
		case 2:
			System.out.println("Which Product do you want to see?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-------------------------------------");
			System.out.println(product);
			adminMenu();
			break;
		case 3:
			List<Product> productList = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-------------------------------------");
			for (Product p : productList) {
				System.out.println(p);
			}
			adminMenu();
			break;
		case 4:
			System.out.println("Which Product do you want to Update ?");
			dao.updateProduct(sc.nextInt());
			adminMenu();
			break;
		case 5:
			System.out.println("Which Product do you want to Delete ?");
			dao.deleteProduct(sc.nextInt());
			adminMenu();
			break;
		case 6:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1- 6 only");

		}
	}

	public static void customerMenu() {
		System.out.println("------------------------------");
		System.out.println("|    CUSTOMER MAIN MENU       |");
		System.out.println("------------------------------");
		System.out.println("|    1. View Product         |");
		System.out.println("|    2. View All Products    |");
		System.out.println("|    3. Bill                 |");
		System.out.println("|    4. Back                 |");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Which Product do you want to see?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-------------------------------------");
			System.out.println(product);
			customerMenu();
			break;
		case 2:
			List<Product> productList = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-------------------------------------");
			for (Product p : productList) {
				System.out.println(p);
			}
			customerMenu();
			break;
		case 3:
			dao.bill();
			customerMenu();
			break;
		case 4:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1- 4 only");

		}
	}

}
