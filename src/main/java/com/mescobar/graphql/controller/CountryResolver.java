package com.mescobar.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mescobar.graphql.model.Country;
import com.mescobar.graphql.service.ICountryService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class CountryResolver implements GraphQLQueryResolver {


	@Autowired
	private ICountryService countryService;

	public Country country(Long id) {
		return countryService.getCountryById(id);
	}

	public List<Country> allCountries() {
		return countryService.findAll();
	}

	public List<Country> countriesByName(String name) {
		return countryService.findByName(name);
	}
}
