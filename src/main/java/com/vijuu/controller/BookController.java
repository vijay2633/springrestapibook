package com.vijuu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijuu.dto.BookDTO;
import com.vijuu.service.BookService;
import com.vijuu.service.BookServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceImpl service;
	
	
	@PostMapping("/book")
	public ResponseEntity<String> addBookDetails (@RequestBody BookDTO bdto){
		String msg = service.addBookDetails(bdto);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	

}
