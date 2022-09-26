package com.mescobar.graphql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mescobar.graphql.model.Country;
import com.mescobar.graphql.repository.CountryRepository;
import com.mescobar.graphql.service.ICountryService;

@Service
public class CountryService implements ICountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public Country getCountryById(Long id) {
		return countryRepository.findById(id).get();
	}

	@Override
	public void deleteCountryById(Long id) {
		countryRepository.deleteById(id);

	}

	@Override
	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	@Override
	public List<Country> findByName(String name) {
		return countryRepository.findByName(name);

	}
}
