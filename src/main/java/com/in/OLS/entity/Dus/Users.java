package com.in.OLS.entity.Dus;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.in.OLS.entity.BookInfo;
/*
@Entity(name="user")
@IdClass(UserPK.class)
public class Users implements Serializable{
	
	private static final long serialVersionUID=1;
	
	@Column(name="User_Name")
	@Id
	private String user;
	
	@Column(name="BOOK_ID")
	@Id
	private String BookId;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="User_Type")
	@Id
   private String UserType;
	
	
	 @OneToOne
@PrimaryKeyJoinColumn(name="BOOK_ID",referencedColumnName = "BOOK_ID") private
	  List<BookInfo> BookInfo;
	 
	 
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	password = password;
}
public String getUserType() {
	return UserType;
}
public void setUserType(String userType) {
	UserType = userType;
}

  public List<BookInfo> getBookInfo() { return BookInfo; } public void
 setBookInfo(List<BookInfo> bookInfo) { BookInfo = bookInfo; }
 
   

}
*/