package com.chandra.pms.menus;

import java.util.List;
import java.util.Scanner;

import com.chandra.pms.dao.ProductDAO;
import com.chandra.pms.dao.ProductDAOImpl;
import com.chandra.pms.model.Product;

public class ProductDetails {
	static Scanner sc = new Scanner(System.in);
	static ProductDAO dao = new ProductDAOImpl();

	public static void adminMenu() {
		System.out.println("---------------------------");
		System.out.println("|    ADMIN MAIN MENU      |");
		System.out.println("---------------------------");
		System.out.println("|  1. CREATE PRODUCT      |");
		System.out.println("|  2. VIEW ALL PRODUCTS   |");
		System.out.println("|  3. VIEW PRODUCT        |");
		System.out.println("|  4. UPDATE PRODUCT      |");
		System.out.println("|  5. DELETE PRODUCT      |");
		System.out.println("|  6. BACK                |");
		System.out.println("----------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int i = 1;
			while (i == 1) {
				System.out.println("Enter Product Id ?");
				int pid = sc.nextInt();
				System.out.println("Enter Product Name ?");
				String name = sc.next();
				System.out.println("Enter Product Qty ?");
				int qty = sc.nextInt();
				System.out.println("Enter Product Price ?");
				double price = sc.nextDouble();
				Product product = new Product(pid, name, qty, price);
				dao.createProduct(product);
				System.out.println("Do you want to create more products press 1 else any number ?");
				i = sc.nextInt();
			}
			adminMenu();
			break;
		case 2:
			List<Product> products = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			adminMenu();
			break;
		case 3:
			System.out.println("Enter Your Search Product ?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			System.out.println(product);
			adminMenu();
			break;
		case 4:
			System.out.println("Which Product do you want to Update ?");
			int pid = sc.nextInt();
			product = dao.viewProduct(pid);
			System.out.println("Select Your Choice : 1.Name  2. Qty  3. Price");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter Updated Product Name ?");
				product.setPname(sc.next());
			} else if (ch == 2) {
				System.out.println("Enter Updated Product Qty ?");
				product.setQty(sc.nextInt());
			} else if (ch == 3) {
				System.out.println("Enter Updated Product Price ?");
				product.setPrice(sc.nextDouble());
			}
			dao.updateProduct(pid, product);
			adminMenu();
			break;
		case 5:
			System.out.println("Which Product do you want to delete ?");
			dao.deleteProduct(sc.nextInt());
			adminMenu();
			break;
		case 6:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");
		}
	}

	public static void customerMenu() {
		System.out.println("---------------------------");
		System.out.println("|    CUSTOMER MAIN MENU   |");
		System.out.println("---------------------------");
		System.out.println("|  1. VIEW ALL PRODUCTS   |");
		System.out.println("|  2. VIEW PRODUCT        |");
		System.out.println("|  3. BILL                |");
		System.out.println("|  4. BACK                |");
		System.out.println("----------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			List<Product> products = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			customerMenu();
			break;
		case 2:
			System.out.println("Enter Your Search Product ?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			System.out.println(product);
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
			System.out.println("Please select your choice range 1-4 only");
		}
	}

}
