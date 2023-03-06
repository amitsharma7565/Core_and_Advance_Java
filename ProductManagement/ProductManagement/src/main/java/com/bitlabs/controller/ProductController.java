package com.bitlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bitlabs.dao.ProductDao;
import com.bitlabs.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDao dao;
	
	
@RequestMapping("/home")
public String home() {
	return "index";
}
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute Product product,Model model){
		this.dao.addProduct(product);
		return "success";
	
		}
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Product>list=dao.getAllProducts();
		model.addAttribute("products",list);
		return "allProducts";
		
	}
	
	@RequestMapping("/delete/{pid}")
public String getAll(@PathVariable("pid")int pid) {
		this.dao.delete(pid);
		return "success";
		
	}

	@RequestMapping("/update/{pid}")
	public String getAll(@PathVariable("pid")int pid,Model model){
		Product p=this.dao.getProductById(pid);
		model.addAttribute("product",p);
		return "index1";
		
	}

}
