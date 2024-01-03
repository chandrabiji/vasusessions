package com.chandra.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chandra.pms.db.DBUtil;
import com.chandra.pms.exception.ProductNotFoundException;
import com.chandra.pms.main.ProductManagement;
import com.chandra.pms.model.Product;
import com.chandra.pms.query.ProductQuery;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	Connection con = DBUtil.getConnection();
	PreparedStatement ps = null;
	public List<Product> products = new ArrayList<Product>();
	Product product=null;

	@Override
	public void createProduct(Product product) {
		try {
			ps = con.prepareStatement(ProductQuery.CREATE_PRODUCT);
			ps.setInt(1, product.getPid());
			ps.setString(2, product.getPname());
			ps.setInt(3, product.getQty());
			ps.setDouble(4, product.getPrice());
			int r1 = ps.executeUpdate();
			if(r1!=0) {
				System.out.println("Successfully Product Inserted....");
			}else {
				System.out.println("Notable to inserted.Please try again");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
	}

	@Override
	public List<Product> viewAllProducts() {
	    products = new ArrayList<Product>();
		try {
			ps = con.prepareStatement(ProductQuery.VIEW_ALL_PRODUCTS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				product = new Product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setQty(rs.getInt(3));
				product.setPrice(rs.getDouble(4));
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public Product viewProduct(int pid) {
		try {
			ps = con.prepareStatement(ProductQuery.VIEW_PRODUCT);
			ps.setInt(1, pid);
		    ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				product = new Product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setQty(rs.getInt(3));
				product.setPrice(rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public void updateProduct(int pid, Product updatedProduct) {
		try {
			ps = con.prepareStatement(ProductQuery.UPDATE_PRODUCT);
			ps.setString(1, updatedProduct.getPname());
			ps.setInt(2, updatedProduct.getQty());
			ps.setDouble(3, updatedProduct.getPrice());
			ps.setInt(4, pid);
			int r5 = ps.executeUpdate();
			if(r5!=0) {
				System.out.println("Successfully Product Updated....");
			}else {
				System.out.println("Product Notable to updated. Please try again");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteProduct(int pid) {
		try {
			ps = con.prepareStatement(ProductQuery.DELETE_PRODUCT);
			ps.setInt(1, pid);
			int r4 = ps.executeUpdate();
			if(r4!=0) {
				System.out.println("Successfully Product Deleted....");
			}else {
				System.out.println("Notable to deleted.Please try again");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void back() {
		ProductManagement.main(null);
		
	}

	@Override
	public void bill() {
		List<Product> products = viewAllProducts();
		for(Product pl:products) {
			System.out.println(pl);
		}
		System.out.println("select which product do you want to buy ?");
		int selectedProduct = sc.nextInt();
		System.out.println("How much Quantity do you want ?");
		int selectedQty = sc.nextInt();
		for(Product pl:products) {
			if(pl.getPid()==selectedProduct) {
				System.out.println("------------------------------------------");
				System.out.println("|                BILL                    |");
				System.out.println("------------------------------------------");
				System.out.println("   PRODUCT ID            : "+selectedProduct);
				System.out.println("   PRODUCT NAME          : "+pl.getPname());
				System.out.println("   PRODUCT QTY           : "+selectedQty);
				System.out.println("   PRODUCT PRICE         : "+pl.getPrice());
				System.out.println("-------------------------------------------");
				System.out.println("   Total Amount          :"+(selectedQty*pl.getPrice()));
				System.out.println("--------------------------------------------");
				try {
					ps = con.prepareStatement("UPDATE PRODUCT SET qty = ? WHERE pid = ?");
					ps.setInt(1, pl.getQty()-selectedQty);
					ps.setInt(2, selectedProduct);
					int result = ps.executeUpdate();
					if(result!=0) {
						System.out.println("Thank you. Visiti Once again......");
					}else {
						throw new ProductNotFoundException("Something went wrong. please try again");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			}
		}
		
	}

}
