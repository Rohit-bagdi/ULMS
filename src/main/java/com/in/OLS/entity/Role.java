package com.in.OLS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRollname() {
		return rollname;
	}

	public void setRollname(String rollname) {
		this.rollname = rollname;
	}

	@Column
	@Id
	private int id;
	
	@Column
	private String rollname;
	
	

}
