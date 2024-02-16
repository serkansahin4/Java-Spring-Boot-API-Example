package com.serkan.demo.business;

import java.util.List;

import com.serkan.demo.entities.City;

public interface ICityService {
    List<City> GetCities();
    City Get(int id);
    void Add(City city);
    void Update(City city);
    void Delete(int id);
}
