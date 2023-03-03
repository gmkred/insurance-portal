package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.dto.CategoryDTO;
import com.dxc.model.Category;
import com.dxc.service.ICategoryService;
import com.dxc.utils.ConversionUtils;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService service;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String showCategoryPage() {
		return "category";
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

	/**
	 * This method is responsible for insertion or creation of a category record in
	 * the database.
	 * 
	 * @param categoryName parameter stores the ModelAttribute in it from UI page
	 *                     and @ModelAttribute maps UI page ModelAttribute object to
	 *                     the Java object.
	 * @param model        is used here to send the data from controller to UI
	 * @return "category" page which is a string
	 */
	@PostMapping("/save")
	public String saveCategory(@ModelAttribute(name = "categoryName") String categoryName, Model model) {
		Long id = service.saveCategory(categoryName);
		String message = "Category created with id : " + id;
		model.addAttribute("message", message);
		return "category";
	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/details")
	public String getCategories(Model model) {
		List<Category> categories = service.getCategories();
		List<CategoryDTO> categoryDTOs = ConversionUtils.convertCategoryToDTO(categories);
		model.addAttribute("categories", categoryDTOs);
		return "categoryDetails";
	}

	/**
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/delete")
	public String deleteCategory(@RequestParam Long id, Model model) {
		service.deleteCategory(id);
		String message = new StringBuffer().append("Category having id ").append(id).append(" is deleted successfully")
				.toString();

		model.addAttribute("message", message);
		return "redirect:details";

	}

}