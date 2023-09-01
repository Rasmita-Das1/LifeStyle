package com.lifestyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifestyle.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
    User findByUsername(String username);
    
}
