package com.mum.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mum.model.Address;
import com.mum.model.House;

@Repository
public class HouseDao {
	
	private static List<House> houses;
	
	static {
		houses=new ArrayList<>();
		
		
		houses.add(new House(101,1400.0,"Rosewell",new ArrayList<Address>()));
		
		List<Address> house1Addresses=new ArrayList<Address>() {{
			add(new Address(12345,"Sandy street"));
			add(new Address(6543,"Raintree dr"));
			add(new Address(6759,"5 points dr"));
			
		}};
		
		
		houses.add(new House(104,1600.0,"Alphareta",house1Addresses));
		
		houses.add(new House(105,1700.0,"Decater",new ArrayList<Address>() {{
			add(new Address(18765,"garnet"));
			add(new Address(87600,"publix st"));
			add(new Address(90998,"Holcom bridge rd"));
			
		}}));	
		
		houses.add(new House(107,700.0,"Clarkston",new ArrayList<Address>()));
		houses.add(new House());
		
	}
	
	
	public List<House> getAllHouses() {
		return houses;
		
	}
	
	public Optional<House> getHouseById(int houseId) {
		return houses.stream().filter(h->h.getHouseId()==houseId).findFirst();
	}
	
	public void addHouse(House house)
	{
		houses.add(house);
	}
	
	public List<House> deleteHouse(int houseId) {
		houses.removeIf(h->h.getHouseId()==houseId);
		return houses;
	}

	
	
	public List<House> updateHome(House house, int houseId) {		
		
		for(House h:houses) {
			if(h.getHouseId()==houseId) {
				h.setHouseId(houseId);
				h.setLocation(house.getLocation());
				h.setRent(house.getRent());
			}
			
		}
		
		houses.forEach(System.out::println);
		
		
		return houses;
	}

}
