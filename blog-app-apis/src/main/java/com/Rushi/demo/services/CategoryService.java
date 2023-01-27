package com.Rushi.demo.services;

import java.util.List;

import com.Rushi.demo.payloads.CategoryDto;

public interface CategoryService {

	
	//create
	CategoryDto createCategory(	CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(	CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getCategories();
}
