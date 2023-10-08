package com.tns.cm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

	private int id;
	private String name;
	private String oreder_id;
	private String email;
	
	
	
	//Communication happens through using Constructor
	public Customer() {
		super();
	}




	public Customer(Integer id, String name, String oreder_id, String email) {
		super();
		this.id = id;
		this.name = name;
		this.oreder_id = oreder_id;
		
		this.email = email;
	}



    @Id
    @GeneratedValue
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




	public String getOreder_id() {
		return oreder_id;
	}




	public void setOreder_id(String oreder_id) {
		this.oreder_id = oreder_id;
	}






	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}


//to get the formated output same as given order of input
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", oreder_id=" + oreder_id + ", email="
				+ email + "]";
	}
	
	
	
	
}