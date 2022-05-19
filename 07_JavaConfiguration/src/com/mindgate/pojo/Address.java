package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {
	private int addresId;
	private String street;
	private String city;
	private String state;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addresId, String street, String city, String state) {
		super();
		this.addresId = addresId;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getAddresId() {
		return addresId;
	}

	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public String toString() {
		return "Address [addresId=" + addresId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
