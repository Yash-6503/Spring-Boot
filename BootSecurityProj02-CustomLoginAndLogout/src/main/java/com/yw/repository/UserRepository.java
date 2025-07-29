package com.yw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yw.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
