package com.in.OLS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.OLS.entity.BookInfo;

@Repository
public interface BookRepo extends JpaRepository<BookInfo, Integer> {
	
	public BookInfo findByBookName(String bookname);

}
