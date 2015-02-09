package org.celtab.domain.address;

import javax.persistence.Entity;

import org.celtab.domain.model.TimeStampedBean;

@Entity
public class Country extends TimeStampedBean { 

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String symbol;
	private String nationality_name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getNationality_name() {
		return nationality_name;
	}
	public void setNationality_name(String nationality_name) {
		this.nationality_name = nationality_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((nationality_name == null) ? 0 : nationality_name.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationality_name == null) {
			if (other.nationality_name != null)
				return false;
		} else if (!nationality_name.equals(other.nationality_name))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", symbol=" + symbol
				+ ", nationality_name=" + nationality_name + "]";
	}	
}
