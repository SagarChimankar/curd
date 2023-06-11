package com.ashokit.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.model.Book;

@Service
public interface bookService {
	public String upsert(Book book);
	
	public List<Book> getAllBook();
	
	public String deleteById(Integer id);
}
