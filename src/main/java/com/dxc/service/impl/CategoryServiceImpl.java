package com.dxc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Category;
import com.dxc.repo.CategoryRepository;
import com.dxc.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepo;

	@Override
	public Long saveCategory(String categoryName) {
		Category category = new Category();
		category.setName(categoryName);
		return categoryRepo.save(category).getId();
	}

	@Override
	public List<Category> getCategories() {
		return categoryRepo.findAll();
	}
}