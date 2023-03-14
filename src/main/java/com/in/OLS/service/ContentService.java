package com.in.OLS.service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.OLS.Dao.BookRepo;
import com.in.OLS.Dao.Contents;
import com.in.OLS.entity.BookInfo;
import com.in.OLS.entity.BookPK;
import com.in.OLS.entity.Books;
import com.in.OLS.exception.PageNotFound;

@Service
public class ContentService {
	
	
	
	@Autowired
	private Contents contents;
	
	@Autowired
	private BookRepo books;
	
	
	public String getBytesofData(String Data) throws UnsupportedEncodingException
	{
		byte[] utf = new byte[100];
		 utf = Data.getBytes("UTF-8");
		System.out.println(utf.length); 
		byte[] newArray = Arrays.copyOfRange(utf, 0, 100);
	String str = new String(newArray, StandardCharsets.UTF_8);
		return str;
		
	}
	
	public String getBytesofData(String Data,int bytes) throws UnsupportedEncodingException
	{
		byte[] utf = new byte[100];
		 utf = Data.getBytes("UTF-8");
		System.out.println(utf.length); 
		byte[] newArray = Arrays.copyOfRange(utf, 0, bytes);
	String str = new String(newArray, StandardCharsets.UTF_8);
		return str;
		
	}
	
	public String getContents(String BookName,int PageName) throws UnsupportedEncodingException, PageNotFound
	{
BookInfo bi = books.findByBookName(BookName);
		
		BookPK bk = new BookPK(PageName,bi.getBookId());
		Optional<Books>  book = contents.findById(bk);
		if(!book.isPresent())
		{
			throw new PageNotFound("Page dosenot exist");
		}
		return getBytesofData(book.get().getCONTENT());
		
	}
	
	
	public String getContents(String BookName,int PageName,int Bytes) throws UnsupportedEncodingException, PageNotFound
	{
BookInfo bi = books.findByBookName(BookName);
		
		BookPK bk = new BookPK(PageName,bi.getBookId());
		Optional<Books>  book = contents.findById(bk);
		if(!book.isPresent())
		{
			throw new PageNotFound("Page dosenot exist");
		}
		return getBytesofData(book.get().getCONTENT(),Bytes);
		
	}

}
