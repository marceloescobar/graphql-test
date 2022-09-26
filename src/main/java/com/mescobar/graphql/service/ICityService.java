package com.mescobar.graphql.service;

import java.util.List;

import com.mescobar.graphql.model.City;

public interface ICityService {

	City saveCity(City city);

	City getCityById(Long id);

	void deleteCityById(Long id);

	List<City> findAll();

	List<City> findByName(String name);
	
}
