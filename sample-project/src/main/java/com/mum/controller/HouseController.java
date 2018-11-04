package com.mum.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mum.model.House;
import com.mum.service.HouseService;

@RestController
public class HouseController {
	
	
	@RequestMapping()
	public String welcome() {
		return "<a href='/house-app/houses'> Home </a>";
	}
	
	@Autowired
private HouseService houseService;
	
		
	@GetMapping(value="/houses")
	public List<House> getAll(){
		return houseService.getAll();
	}
	
	@GetMapping(value="/houses/{houseId}")
	public Optional<House> getOne(@PathVariable("houseId") int houseId){
		
	
		 Optional<House> house = houseService.getHouse(houseId);
		 if(house.isPresent()) {
			 return house;
		 }
		 else return Optional.of(new House(000,0.000,"House NOT Found",new ArrayList<>()));
		 
	}
	
	
	
	@PostMapping(value="/add-house")
	public List<House> AddHouse(@RequestBody House house){
		houseService.AddgetHouse(house);		
		return houseService.getAll();
	}
	
	@DeleteMapping(value="/delete-house/{houseId}")
	public List<House> deleteHouse(@PathVariable("houseId") int houseId){
		return houseService.deleteHouse(houseId);
	}
	
	
	@PutMapping(value="/update-house/{houseId}")
	public List<House> updateHouse( @RequestBody House house, @PathVariable("houseId") int houseId){
		
		System.out.println("Here we are!");
		
		return houseService.updateHouse(house,houseId);
		
		
		
		
	}


}
