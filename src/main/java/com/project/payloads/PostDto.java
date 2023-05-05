package com.project.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.project.entities.Comment;



public class PostDto {
	
	
	 
 private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	public PostDto() {
		
	}
	
	
	private CategoryDto category;
	
	
	private UserDto user;
	
	
	private Set<CommentDto> comments=new HashSet<>();

	

	public Set<CommentDto> getComments() {
		return comments;
	}


	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public CategoryDto getCategory() {
		return category;
	}


	public void setCategory(CategoryDto category) {
		this.category = category;
	}


	public UserDto getUser() {
		return user;
	}


	public void setUser(UserDto user) {
		this.user = user;
	}


	
	
}
