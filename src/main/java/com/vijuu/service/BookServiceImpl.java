package com.vijuu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijuu.dto.BookDTO;
import com.vijuu.entity.Book;
import com.vijuu.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository brepo;
	
	@Override
	public String addBookDetails(BookDTO bdto) {
		Book book = new Book();
		book.setBookId(bdto.getBookId());
		book.setBookName(bdto.getBookName());
		book.setBookPrice(bdto.getBookPrice());
		
		brepo.save(book);
		
		return "book details inserted";
	}

}
