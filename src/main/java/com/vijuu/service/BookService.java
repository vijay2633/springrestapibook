package com.vijuu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vijuu.dto.BookDTO;
import com.vijuu.entity.Book;

@Service
public interface BookService {
	
	public String addBookDetails(BookDTO bdto);
	
	public List<Book> getAllBookDetails();
	
	
	
	

}
