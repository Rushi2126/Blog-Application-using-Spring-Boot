package com.Rushi.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rushi.demo.entities.Category;
import com.Rushi.demo.entities.Post;
import com.Rushi.demo.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}