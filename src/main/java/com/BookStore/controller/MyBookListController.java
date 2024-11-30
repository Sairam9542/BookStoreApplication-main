package com.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService service;
	
	
	@RequestMapping("/deleteMylist/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_books";
	}
}
