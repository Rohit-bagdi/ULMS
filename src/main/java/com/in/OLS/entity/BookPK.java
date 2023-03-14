package com.in.OLS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.IdClass;

@Embeddable
public class BookPK  implements Serializable{
	
	private static final long serialVersionUID=1;
	
	@Column(name="Page_NO")
	private int pageno;
	
	public BookPK(int pageno, int bookID) {
		super();
		this.pageno = pageno;
		this.bookID = bookID;
	}

	@Override
	public String toString() {
		return "BookPK [pageno=" + pageno + ", bookID=" + bookID + "]";
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	@Column(name="BOOK_ID")
	private int bookID;

}
