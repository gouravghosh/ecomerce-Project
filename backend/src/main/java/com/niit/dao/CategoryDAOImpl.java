package com.niit.dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Catagory;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO 
{
           @Autowired
           SessionFactory sessionFactory;
           
	public boolean addCategory(Catagory category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		
		catch(Exception e)
		{
		return false;
		}
		
	}

	public boolean updateCategory(Catagory category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteCategory(Catagory category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	public Catagory getCategory(int categoryId) {
		try
		{
			Session session= sessionFactory.getCurrentSession();
			Catagory category=(Catagory)session.get(Catagory.class,categoryId);
			return category;
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public List<Catagory> listCategories() {
		try
		{
			Session session= sessionFactory.openSession();
			Query query=session.createQuery("from Category");
			List<Catagory> listCategories=query.list();
			session.close();
			return listCategories;
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
