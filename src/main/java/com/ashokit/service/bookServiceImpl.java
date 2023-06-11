package com.ashokit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bookRepo.bookRepository;
import com.ashokit.model.Book;

@Service
public class bookServiceImpl implements bookService {
	
	
	private bookRepository bRepo;
	
	public bookServiceImpl(bookRepository bRepo) {
		super();
		this.bRepo = bRepo;
	}

	@Override
	public String upsert(Book book) {
		
		Integer id=book.getBid();
		
		Book save=bRepo.save(book);
		
		if(id==null) {
			return "Insert";
		}else{
			return "update";
		}
		
		
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> allData=bRepo.findAll();
		return allData;
	}

	@Override
	public String deleteById(Integer id) {
		bRepo.deleteById(id);
		
		return "Deleted Sucessfully....";
	}

}
