package com.project.Services;

import java.util.List;

import com.project.payloads.PostDto;
import com.project.payloads.PostResponse;



public interface PostService {
	
	//create
	
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

	//update

	PostDto updatePost(PostDto postDto, Integer postId);

	//delete

	void deletePost(Integer PostId);

	//get All posts

	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);

	//get single post

	PostDto getPostById(Integer postId);

	//get all post by category

	List<PostDto> getPostByCategory(Integer categoryId);

	//get all post by user

	List<PostDto> getPostByUser(Integer userId);

	//search
	List<PostDto> searchPosts(String keyword);


}
