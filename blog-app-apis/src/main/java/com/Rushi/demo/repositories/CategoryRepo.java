package com.Rushi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rushi.demo.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	

}
