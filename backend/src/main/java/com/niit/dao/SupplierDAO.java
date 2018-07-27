package com.niit.dao;

import java.util.List;

import com.niit.model.Suppliers;

public interface SupplierDAO 
{
	public boolean addSupplier(Suppliers supplier);
	public boolean updateSupplier(Suppliers supplier);
	public boolean deleteSupplier(Suppliers supplier);
	
	public Suppliers getSupplier(int supplierId);
	public List<Suppliers> listSupplier();
}
