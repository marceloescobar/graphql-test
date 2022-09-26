package com.mescobar.graphql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mescobar.graphql.model.City;
import com.mescobar.graphql.repository.CityRepository;
import com.mescobar.graphql.service.ICityService;

public class CityService implements ICityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public List<City> findByName(String name) {
		return cityRepository.findByName(name);
	}

	@Override
	public City saveCity(City city) {
		return cityRepository.save(city);
	}

	@Override
	public City getCityById(Long id) {
		return cityRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCityById(Long id) {
		cityRepository.deleteById(id);
	}
}
