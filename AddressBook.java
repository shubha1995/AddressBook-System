package com.addressbook;
import java.util.*;

public class AddressBook {

	private String first_name;
	private String last_name;
	private String city;
	private String state;
	private int zip;
	private long phone_number;   
	private String email;
	
	public AddressBook() {
		this.first_name=null;
		this.last_name=null;
		this.city=null;
		this.state=null;;
		this.zip=0;
		this.phone_number=0;   
		this.email=null;
		
	}


	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBook [first_name=" + first_name + ", last_name=" + last_name + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone_number=" + phone_number + ", email=" + email + "]";
	}
	
	


}

