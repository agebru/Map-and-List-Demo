package com.mum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.dao.HouseDao;
import com.mum.model.House;

@Service
public class HouseService {
	
	
	@Autowired
	private HouseDao houseDao;
	
	public List<House> getAll(){
		return houseDao.getAllHouses();
	}
	
	
	public Optional<House> getHouse(int houseId) {
		return houseDao.getHouseById(houseId);
	}
	
	
	
	public void AddgetHouse(House house) {
		 houseDao.addHouse(house);
	}
	
	
	public List<House> deleteHouse(int houseId){
		return houseDao.deleteHouse(houseId);
	}


	public List<House> updateHouse(House house, int houseId) {
		return houseDao.updateHome(house,houseId);
	}

}
