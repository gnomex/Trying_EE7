package org.celtab.domain.address;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	@ManyToOne
	private CEP cep;
	@ManyToOne
	private Street street;
	@ManyToOne
	private Neighborhood neighborhood;
	@ManyToOne
	private City city;
	
	public CEP getCep() {
		return cep;
	}
	public void setCep(CEP cep) {
		this.cep = cep;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public Neighborhood getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
