package com.mum.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class House {
	private int houseId;
	private double rent;
	private String location;
	List<Address> addresses;
	
	
	public House() {
		
	}
	
	
	
	
	public House(int houseId, double rent, String location,List<Address> addresses) {
		super();
		this.houseId = houseId;
		this.rent = rent;
		this.location = location;
		this.addresses=addresses;
	}




	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	public List<Address> getAddresses() {
		return addresses;
	}




	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}




	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", rent=" + rent + ", location=" + location + "]";
	}
	
	

}
