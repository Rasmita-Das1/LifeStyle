package com.lifestyle.service;

import java.util.List;

import com.lifestyle.model.Category;

public interface CategoryService {
	
    List<Category> listAllCategories();

    Category getCategoryById(Long id);

    Category addCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategoryById(Long id);
}
