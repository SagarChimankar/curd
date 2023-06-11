package com.ashokit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.Book;
import com.ashokit.service.bookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("hii this is api for book")
public class BookController {
	
	@Autowired
	private bookService bServ;
	
	@PostMapping("/book")
	@ApiOperation("this method is used for upsert book data into db")
	public ResponseEntity<String> BookUpsert(@RequestBody Book book){
		String msg=bServ.upsert(book);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/alldata")
	@ApiOperation("This method for get all data")
	public ResponseEntity<List<Book>> GetAllData(){
		List<Book> allData=bServ.getAllBook();
		return new ResponseEntity<List<Book>>(allData,HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{id}")
	@ApiOperation("This method for delete data")
	public ResponseEntity<String> Delbyid(@PathVariable Integer id){
		String msgpatload=bServ.deleteById(id);
		return new ResponseEntity<String>(msgpatload,HttpStatus.OK);
	}
}
