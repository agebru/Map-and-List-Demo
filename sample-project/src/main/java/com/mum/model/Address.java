package com.mum.model;

public class Address {
	private int zipCode;
	private String street;
	
	
	public Address() {
		
	}


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public Address(int zipCode, String street) {
		super();
		this.zipCode = zipCode;
		this.street = street;
	}
	
	
	

}
