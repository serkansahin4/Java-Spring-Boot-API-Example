package com.serkan.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="city")
@Table(name="city")
public class City {
	@Id
	@Column(name="ID")
    private int id;
	@Column(name="Name")
    private String name;
	@Column(name="District")
    private String district;
	@Column(name="Population")
    private int population;
	
	public City() {}
	public City(int id, String name, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
