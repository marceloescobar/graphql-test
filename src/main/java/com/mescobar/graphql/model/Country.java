package com.mescobar.graphql.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String language;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "capital_id", referencedColumnName = "id")
	private City capital;
	
}
