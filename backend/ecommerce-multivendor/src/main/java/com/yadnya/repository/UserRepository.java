package com.yadnya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yadnya.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);
}
 