package com.project.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.lms.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

