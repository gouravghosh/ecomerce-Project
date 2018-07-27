package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Catagory {

	@Id
	@GeneratedValue
	
	int ProductID;
	String ProductName;
	String Productdesc;
	int Price;
	int Stock;
	int CategoryID;
	int SupplierID;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductdesc() {
		return Productdesc;
	}
	public void setProductdesc(String productdesc) {
		Productdesc = productdesc;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	
	
	
}
