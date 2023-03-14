package com.in.OLS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.OLS.entity.BookInfo;
import com.in.OLS.entity.BookPK;
import com.in.OLS.entity.Books;

@Repository
public interface Contents extends JpaRepository<Books, BookPK>{
}
