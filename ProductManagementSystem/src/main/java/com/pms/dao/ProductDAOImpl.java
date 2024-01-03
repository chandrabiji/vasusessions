package com.pms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.print.attribute.standard.OrientationRequested;

import com.pms.main.ProductManagementSystem;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> originalList = new ArrayList<Product>();
	ArrayList<Product> tempList = new ArrayList<Product>();
	Product product = null;
	int n = 1;

	@Override
	public void addProduct() {
		while(n==1) {
			System.out.println("Enter Product Id ?");
			String pno = sc.next();
			while(!Pattern.matches("[0-9]{4}", pno)) {
				System.err.println("Product Id must be  4 digit Number ");
				pno = sc.next();
			}
			int pid = Integer.parseInt(pno);
			System.out.println("Enter Product Name ?");
			String pname = sc.next();
			while(!Pattern.matches("[a-zA-Z]*", pname)) {
				System.err.println("Product Name must be Characters");
				pname = sc.next();
			}
			System.out.println("Enter Product Qty ?");
			String qt = sc.next();
			while(!Pattern.matches("[0-9]{2}", qt)) {
				System.err.println("Quantity must be 2 digits only");
				qt = sc.next();
			}
			int qty = Integer.parseInt(qt);
			System.out.println("Enter Product Price ?");
			double price = sc.nextDouble();
			product = new Product(pid,pname,qty,price);
			originalList.add(product);
			System.out.println("Do you want to add more products press 1 else any numer?");
			n = sc.nextInt();
		}
		
	}

	@Override
	public Product viewProduct(int pid) {
		product = new Product();
		for(Product p1:originalList) {
			if(p1.getPid()==pid) {
				product = p1;
				break;
			}
		}
		return product;
	}

	@Override
	public List<Product> viewAllProducts() {
		
		return originalList;
	}

	@Override
	public void updateProduct(int pid) {
		tempList = new ArrayList<Product>();
		for(Product p2:originalList) {
			if(p2.getPid()==pid) {
				System.out.println("Select your choice : 1. Pname 2.Qty 3.Price");
				int ch = sc.nextInt();
				if(ch==1) {
					System.out.println("Enter Updated Product Name ?");
					p2.setPname(sc.next());
				}else if(ch==2) {
					System.out.println("Enter Updated Product Qty ?");
					p2.setQty(sc.nextInt());
				}else if(ch==3) {
					System.out.println("Enter Updated Product Price ?");
					p2.setPrice(sc.nextDouble());
				}
				tempList.add(p2);
			}else {
				tempList.add(p2);
			}
		}
		originalList = new ArrayList<Product>();
		for(Product p3:tempList) {
			originalList.add(p3);
		}
		System.out.println("Successfully Product Updated....");
		
	}

	@Override
	public void deleteProduct(int pid) {
		tempList = new ArrayList<Product>();
		for(Product p4:originalList) {
			if(p4.getPid()==pid) {
				
			}else {
				tempList.add(p4);
			}
		}
		originalList = new ArrayList<Product>();
		for(Product p5:tempList) {
			originalList.add(p5);
		}
		System.out.println("Successfully Product Deleted...");
		
	}

	@Override
	public void bill() {
		tempList = new ArrayList<Product>();
		Product selectedItems = new Product();
		for(Product p6:originalList) {
			System.out.println(p6);
		}
		System.out.println("Which Product do you want ?");
		selectedItems.setPid(sc.nextInt());
		System.out.println("How much Quantity do you want ?");
		selectedItems.setQty(sc.nextInt());
		for(Product p7:originalList) {
			if(p7.getPid()==selectedItems.getPid()) {
				System.out.println("---------------------------------------");
				System.out.println("|                Bill                 |");
				System.out.println("---------------------------------------");
				System.out.println(" Product Id           :   "+selectedItems.getPid());
				System.out.println(" Product Name         :   "+p7.getPname());
				System.out.println(" Product Quantity     :   "+selectedItems.getQty());
				System.out.println(" Product Price        :   "+p7.getPrice());
				System.out.println("----------------------------------------");
				System.out.println(" Total Amount         :   "+(selectedItems.getQty()*p7.getPrice()));
				System.out.println("-----------------------------------------");
				p7.setQty(p7.getQty()-selectedItems.getQty());
				tempList.add(p7);
			}else {
				tempList.add(p7);
			}
		}
		originalList = new ArrayList<>();
		for(Product p8:tempList) {
			originalList.add(p8);
		}
		System.out.println("Thank you Visit Once again....");
		
	}

	@Override
	public void back() {
		ProductManagementSystem.main(null);
		
	}

}
