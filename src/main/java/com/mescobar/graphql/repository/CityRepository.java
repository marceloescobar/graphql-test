package com.mescobar.graphql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mescobar.graphql.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	@Override
	List<City> findAll();

	List<City> findByName(String name);
}
