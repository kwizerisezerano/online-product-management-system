package com.example.RP01262CRUDProductManagementSystem.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.RP01262CRUDProductManagementSystem.entity.Product;
import com.example.RP01262CRUDProductManagementSystem.repository.Productrepository;


@Controller
public class Productcontroller {
	@Autowired
	private Productrepository srepo;
	
	@GetMapping({"/","allProduct"})
	
	public ModelAndView allProduct() {
		ModelAndView mv = new ModelAndView("list-product");
		java.util.List<Product> list = srepo.findAll();
		mv.addObject("list", list);
		return mv;
		
	}
	
	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("new_product");
		Product new_st = new Product();
		mv.addObject("new_st", new_st);
		return mv;
		
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		srepo.save(product);
		return "redirect:/allProduct";
		
	}
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam long productId){
		
		ModelAndView mv  = new ModelAndView("update-form");
		Product st = srepo.findById(productId).get();
		mv.addObject("new_st", st);
		
		return mv;
		
	}
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestParam long productId) {
		
		srepo.deleteById(productId);
		
		return "redirect:/allProduct";
		
	}
	
	

}
