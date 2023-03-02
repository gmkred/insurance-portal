package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dxc.model.Category;

@Controller
public class CategoryController {

	@PostMapping
	public String saveCategory(@ModelAttribute Category category,Model model) {
		return null;	
	}
	
	
}
