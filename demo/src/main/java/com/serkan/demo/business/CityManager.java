package com.serkan.demo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serkan.demo.dataaccess.ICityDal;
import com.serkan.demo.entities.City;

import jakarta.transaction.Transactional;

@Service
public class CityManager implements ICityService {
     
	private ICityDal  cityDal;

    @Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> GetCities() {
		return cityDal.GetAll();
	}

	@Override
	@Transactional
	public City Get(int id) {
		
		return cityDal.Get(id);
	}

	@Override
	@Transactional
	public void Add(City city) {
		cityDal.Add(city);
	}

	@Override
	@Transactional
	public void Update(City city) {
		cityDal.Update(city);
	}

	@Override
	@Transactional
	public void Delete(int id) {
		cityDal.Delete(Get(id));
	}
    
    
}
