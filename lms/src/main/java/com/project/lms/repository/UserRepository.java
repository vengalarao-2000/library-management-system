package com.project.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.lms.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
