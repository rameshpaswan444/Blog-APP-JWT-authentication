package com.project.Services;

import java.util.List;

import com.project.payloads.CategoryDto;

public interface CategoryService {

	
	//create
		 CategoryDto createCategory(CategoryDto categorydto);
		 
		 //update
		 CategoryDto updateCategory(CategoryDto categorydto,Integer category);
		 
		 //delete
		  void deleteCategory(Integer category);
		 
		 //get
		  CategoryDto getCategory(Integer categoryId);
		 
		 //get All
		  List<CategoryDto> getCategories();
}
