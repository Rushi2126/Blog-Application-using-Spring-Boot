package com.rushi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushi.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}