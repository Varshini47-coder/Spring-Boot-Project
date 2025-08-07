package com.example.RpDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


@Entity
@Table(name="Emptable")
public class Empdata {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="S_No")
	private int sno;
	@Column(name="E_Name")
	private String name;
	@Column(name="E_role")
	private String role;
	@Column(name="E_loc")
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
