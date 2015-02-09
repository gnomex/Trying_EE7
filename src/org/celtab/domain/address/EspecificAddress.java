package org.celtab.domain.address;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EspecificAddress implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	private Integer number;
	private String complement;
	
	@ManyToOne
	private Address address;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
