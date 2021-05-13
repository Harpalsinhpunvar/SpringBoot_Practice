package com.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootcrud.Service.ProductService;
import com.springbootcrud.entities.Product;

@Controller
public class MyController {
	
	private ProductService ps;
	
	@Autowired
	public void setProductService(ProductService ps) {
		this.ps = ps;
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", ps.listAllProducts());
		System.out.println("Returning rproducts:");
		return "products";	
	}
	
	@RequestMapping("products/edit/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("product", ps.getProductById(id));
		return "productform";
	}
	
	@RequestMapping("products/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		return "productform";
	}
	
	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {
		ps.saveProduct(product);
		return "redirect:/product/" + product.getProductId();	
		}
	
	@RequestMapping("product/delete/{id}")
	public String delete(@PathVariable Integer id) {
		ps.deleteProduct(id);
		return "redirect:/product";
	}

}
