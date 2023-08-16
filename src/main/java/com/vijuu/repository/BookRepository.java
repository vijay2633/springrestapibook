package com.vijuu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijuu.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer> {

}
