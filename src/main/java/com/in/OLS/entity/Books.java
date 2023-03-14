package com.in.OLS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="BOOKS")
@IdClass(BookPK.class)
public class Books  implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Override
	public String toString() {
		return "Books [CONTENT=" + CONTENT + ", pageno=" + pageno + ", bookID=" + bookID + "]";
	}

	@Column(name="CONTENT")
	private String CONTENT;
	
	@Column(name="Page_NO")
	@Id
	private int pageno;
	
	@Column(name="BOOK_ID")
	@Id
	private int bookID;

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
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

}
