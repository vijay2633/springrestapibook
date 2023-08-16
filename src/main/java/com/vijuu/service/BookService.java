package com.vijuu.service;

import org.springframework.stereotype.Service;

import com.vijuu.dto.BookDTO;

@Service
public interface BookService {
	
	public String addBookDetails(BookDTO bdto);
	
	
	
	

}
