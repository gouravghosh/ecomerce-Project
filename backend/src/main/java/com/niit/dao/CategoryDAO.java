package com.niit.dao;

import java.util.List;
import java.util.Locale.Category;

import com.niit.model.Catagory;

public interface CategoryDAO 
{
	public boolean addCategory(Catagory category);
	public boolean updateCategory(Catagory category);
	public boolean deleteCategory(Catagory category);
	public Catagory getCategory(int categoryId);
	public List<Catagory> listCategories();
	
}
