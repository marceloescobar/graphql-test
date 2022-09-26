package com.mescobar.graphql.service;

import java.util.List;

import com.mescobar.graphql.model.Country;

public interface ICountryService {

	Country saveCountry(Country country);

	Country getCountryById(Long id);

	void deleteCountryById(Long id);

	List<Country> findAll();

	List<Country> findByName(String name);
}
