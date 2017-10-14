package com.Param.GoplacesFinal.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Place {
	@Id
	private int id;
	private String name;
	private String Loc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	
}
