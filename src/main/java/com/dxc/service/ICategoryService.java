package com.dxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.model.Category;

@Service
public interface ICategoryService {

	public Long saveCategory(String categoryName);

	public List<Category> getCategories();
	public void deleteCategory(Long id);

}
