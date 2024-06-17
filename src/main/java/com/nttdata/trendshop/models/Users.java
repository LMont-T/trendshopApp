package com.nttdata.trendshop.models;

import jakarta.persistence.*;

@Entity
public class Users {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String surname;
	private String address;
	
	
	public Users (){}
	public Users(Integer id, String name, String surname, String address) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
