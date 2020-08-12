package com.restcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restcontroller.entity.Book;

//@RestController
@Controller
public class RestControllerExampleEndPoint {
	
	@GetMapping(value = "/books")
	@ResponseBody
	public Book getBook() {
		Book book = new Book();
		book.setBookId(11);
		book.setBookName("JAVA");
		book.setBookPrice("500");
		
		System.out.println(book);
		return book;
	}
}
