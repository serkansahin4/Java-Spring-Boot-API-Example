package com.serkan.demo.dataaccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.serkan.demo.entities.City;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class NhCityDal implements ICityDal {

	private EntityManager entityManager;
	@Autowired
	public NhCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<City> cities=session.createQuery("from city",City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void Add(City city) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}
	
	@Override
	@Transactional
	public void Update(City city) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}
	
	@Override
	@Transactional
	public void Delete(City city) {
		Session session=entityManager.unwrap(Session.class);
		session.delete(city);
	}

	@Override
	@Transactional
	public City Get(int id) {
		Session session=entityManager.unwrap(Session.class);
		
		return session.get(City.class,id);
	}

}
