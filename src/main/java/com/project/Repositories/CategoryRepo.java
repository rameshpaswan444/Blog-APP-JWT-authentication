package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Category;



public interface CategoryRepo extends JpaRepository<Category, Integer>{

}