package com.serkan.demo.dataaccess;

import java.util.List;

import com.serkan.demo.entities.City;

public interface ICityDal {
	List<City> GetAll();
	City Get(int id);
	void Add(City city);
	void Delete(City city);
	void Update(City city);
	
}
