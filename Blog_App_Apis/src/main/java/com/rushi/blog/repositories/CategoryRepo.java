package com.rushi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushi.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}