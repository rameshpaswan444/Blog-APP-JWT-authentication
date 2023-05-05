package com.project.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Category;
import com.project.entities.Post;
import com.project.entities.User;



public interface PostRepo extends JpaRepository<Post, Integer> {

	
	List<Post> getByUser(User user);
	List<Post> getByCategory(Category category);
    List<Post> findByTitleContaining(String title);
}