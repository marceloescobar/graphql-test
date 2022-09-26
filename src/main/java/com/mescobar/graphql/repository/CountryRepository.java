package com.mescobar.graphql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mescobar.graphql.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

	
	@Override
	List<Country> findAll();

	List<Country> findByName(String name);
}
