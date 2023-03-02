package com.dxc.utils;

import java.util.ArrayList;
import java.util.List;

import com.dxc.dto.CategoryDTO;
import com.dxc.model.Category;

public class ConversionUtils {

	public static List<CategoryDTO> convertCategoryToDTO(List<Category> list) {
		List<CategoryDTO> listDto = new ArrayList<>();
		for (Category c : list) {
			listDto.add(new CategoryDTO(c.getId(), c.getName(), c.getPolicies().size()));
		}
		return listDto;
	}
}
