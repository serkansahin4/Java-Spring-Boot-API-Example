package com.serkan.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serkan.demo.business.ICityService;
import com.serkan.demo.entities.City;

@RestController
@RequestMapping("/api/cities/")
public class CitiesController {
	private ICityService cityService;
	@Autowired
    public CitiesController(ICityService cityService) {
		this.cityService = cityService;
	}

    @GetMapping("/")
    public List<City> Get()
   {
	   return cityService.GetCities();
   }
    
    @GetMapping("{id}")
    public City Get(@PathVariable int id) {
    	return cityService.Get(id);
    }
    
    @PostMapping
    public String Add(@RequestBody City city) {
    	cityService.Add(city);
    	return "Başarılı";
    }
    
    @PutMapping
    public String Put(@RequestBody City city) {
    	cityService.Update(city);
    	return "Başarılı c";
    }
    
    @DeleteMapping("{id}")
    public String Delete(@PathVariable int id) {
    	cityService.Delete(id);
    	return id+"Başarılı";
    }
}
