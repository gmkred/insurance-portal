package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dxc.dto.CategoryDTO;
import com.dxc.model.Category;
import com.dxc.service.ICategoryService;
import com.dxc.utils.ConversionUtils;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService service;

	@GetMapping("/")
	public String showCategoryPage() {
		return "category";
	}

	@PostMapping("/save")
	public String saveCategory(@ModelAttribute(name = "categoryName") String categoryName, Model model) {
		Long id = service.saveCategory(categoryName);
		String message = "Category created with id : " + id;
		model.addAttribute("message", message);
		return "category";
	}

	@GetMapping("/details")
	public String getCategories(Model model) {
		List<Category> categories = service.getCategories();
		System.err.println("no of categories present in the list : " + categories.size());
		List<CategoryDTO> categoryDTOs = ConversionUtils.convertCategoryToDTO(categories);
		model.addAttribute("categories", categoryDTOs);
		return "categoryDetails";
	}

}