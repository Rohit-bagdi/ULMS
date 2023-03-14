package com.in.OLS.controller;

import java.io.UnsupportedEncodingException;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in.OLS.Dao.BookRepo;
import com.in.OLS.Dao.Contents;
import com.in.OLS.entity.BookInfo;
import com.in.OLS.entity.BookPK;
import com.in.OLS.entity.Books;
import com.in.OLS.exception.PageNotFound;
import com.in.OLS.service.ContentService;

@RequestMapping("/books")
@RestController
public class BookController {
	
	
	@Autowired
	private ContentService contentService;
	
	@GetMapping("/{BookName}")
	public String getbooks(@PathVariable String BookName,@RequestParam(defaultValue = "1") int PageName) throws UnsupportedEncodingException, PageNotFound
	{
		
return contentService.getContents(BookName, PageName);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/Admin/{BookName}")
	public String getAdminBooks(@PathVariable String BookName,@RequestParam(defaultValue = "1") int PageName,@RequestParam(defaultValue = "100") int Bytes) throws UnsupportedEncodingException, PageNotFound
	{
		System.out.println("hihih");
return contentService.getContents(BookName, PageName);
	}

}
