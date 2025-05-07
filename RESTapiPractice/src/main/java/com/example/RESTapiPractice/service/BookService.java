package com.example.RESTapiPractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.RESTapiPractice.model.BookModel;

@Service
public class BookService {
	List<BookModel> lst = new ArrayList<>();
	
	public void addBooks(BookModel bookModel) {
		lst.add(bookModel);
	}
	
	public List<BookModel> allBooks(){
		return lst;
	}
}
