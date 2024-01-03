package com.chandra.pms.dao;

import java.util.List;

import com.chandra.pms.model.Product;

public interface ProductDAO {
	
	public void createProduct(Product product);
	public List<Product> viewAllProducts();
	public Product viewProduct(int pid);
	public void updateProduct(int pid,Product updatedProduct);
	public void deleteProduct(int pid);
	public void back();
	public void bill();

}
