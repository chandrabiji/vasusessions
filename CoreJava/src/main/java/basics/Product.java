package basics;

import java.util.Scanner;

public class Product {
	
	public int pid;
	public String pname;
	public int qty;
	public double price;
	
	

	public Product(int pid, String pname, int qty, double price) {
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Array Size ?");
		int size = sc.nextInt();
		Product[] products = new Product[size];
		Product product = null;
		System.out.println("Enter Products into product Array?");
		for(int i=0;i<size;++i) {
			System.out.println("Enter Product Id?");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name?");
			String pname = sc.next();
			System.out.println("Enter Product Qty?");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price ?");
			double price = sc.nextDouble();
			product = new Product(pid,pname,qty,price);
			products[i]=product;
		}
		System.out.println("Product List");
		System.out.println("PID"+"\t"+"PNAME"+"\t"+"QTY"+"\t"+"PRICE");
		System.out.println("------------------------------------------");
		for(Product p1:products) {
			System.out.println(p1.pid+"\t"+p1.pname+"\t"+p1.qty+"\t"+p1.price);
		}

	}

}
