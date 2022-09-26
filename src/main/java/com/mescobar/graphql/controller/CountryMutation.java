package com.mescobar.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mescobar.graphql.model.City;
import com.mescobar.graphql.model.Country;
import com.mescobar.graphql.service.ICityService;
import com.mescobar.graphql.service.ICountryService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class CountryMutation implements GraphQLMutationResolver {

	@Autowired
	private ICountryService countryService;
	
	@Autowired
	private ICityService cityService;

	public Country addCountry(String name, String language) {
		var country = new Country();
		country.setName(name);
		country.setLanguage(language);
		countryService.saveCountry(country);
		return country;
	}
	
	public Country addCountryWithCapital(String name, String language, City capital) {
		var country = new Country();
		country.setName(name);
		country.setLanguage(language);
		country = countryService.saveCountry(country);
		var city = cityService.getCityById(capital.getId());
		if (city != null)
			country.setCapital(city);
		else
			country.setCapital(cityService.saveCity(capital));
		return countryService.saveCountry(country);
	}

	public String deleteCountry(Long id) {
		countryService.deleteCountryById(id);
		return "Country deleted";
	}

	public Country setCapital(Long countryId, Long cityId) {
		var country = countryService.getCountryById(countryId);
		country.setCapital(cityService.getCityById(cityId));
		return countryService.saveCountry(country);
	}

}
