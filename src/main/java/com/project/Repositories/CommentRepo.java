package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Comment;


public interface CommentRepo extends JpaRepository<Comment,Integer>{

}
