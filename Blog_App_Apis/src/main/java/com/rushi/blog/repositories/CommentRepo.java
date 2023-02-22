package com.rushi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushi.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}