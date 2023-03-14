package com.in.OLS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.*; 

 
@Entity(name ="BOOK_INFO")
public class BookInfo implements Serializable{
	
	@Override
	public String toString() {
		return "BookInfo [BookId=" + BookId + ", BookName=" + bookName + ", ListOfBooks=" + ListOfBooks + "]";
	}
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name ="BOOK_ID")
private int BookId;
	
	@Column(name ="BOOK_Name")
	private String bookName;
	

	 @OneToMany
	 @JoinColumn(name="BOOK_ID",referencedColumnName = "BOOK_ID")
	 private List<Books> ListOfBooks;
	 
	
	public List<Books> getListOfBooks() {
		return ListOfBooks;
	}
	public void setListOfBooks(List<Books> listOfBooks) {
		ListOfBooks = listOfBooks;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		bookName = bookName;
	}

}
