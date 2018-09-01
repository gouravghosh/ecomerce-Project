package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class productController 
{
  	@Autowired
    ProductDAO productDAO;
  	
  	
  	@RequestMapping(value="/Product")
  	public String showProductPage(Model m)
  	{
  		Product product=new Product();
  		m.addAttribute(product); 
  		
  		List<Product> listProducts=(List<Product>) productDAO.getProducts();
  		m.addAttribute("listProducts", listProducts);
  		
  		return "Product";
  	}
  	
  	
  	
  	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
  	public String addProduct(@ModeAttribute("product")Product product, Model m)
  	{
  		
		productDAO.addProduct(product);
  		Product product1=new Product();
  		
		m.addAttribute(product1);
  		return "Product";
  	}
}
