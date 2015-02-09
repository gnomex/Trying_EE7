package org.celtab.domain.person;

import javax.persistence.Entity;

@Entity
public class Legal extends Person{

	private static final long serialVersionUID = 1L;
	
	private String registration_number; // CNPJ
	private String tradingName;	// Fancy Name
	
	private String cod_desc_economy_activity; // Code and Description of economic activity - Brazil purpose
	private String cod_decs_legal_nature;	// Code and Description of legal nuture of business - Brazil purpose
		
	public String getTradingName() {
		return tradingName;
	}
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}
	public String getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}
	public String getCod_desc_economy_activity() {
		return cod_desc_economy_activity;
	}
	public void setCod_desc_economy_activity(String cod_desc_economy_activity) {
		this.cod_desc_economy_activity = cod_desc_economy_activity;
	}
	public String getCod_decs_legal_nature() {
		return cod_decs_legal_nature;
	}
	public void setCod_decs_legal_nature(String cod_decs_legal_nature) {
		this.cod_decs_legal_nature = cod_decs_legal_nature;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((cod_decs_legal_nature == null) ? 0 : cod_decs_legal_nature
						.hashCode());
		result = prime
				* result
				+ ((cod_desc_economy_activity == null) ? 0
						: cod_desc_economy_activity.hashCode());
		result = prime
				* result
				+ ((registration_number == null) ? 0 : registration_number
						.hashCode());
		result = prime * result
				+ ((tradingName == null) ? 0 : tradingName.hashCode());
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
		Legal other = (Legal) obj;
		if (cod_decs_legal_nature == null) {
			if (other.cod_decs_legal_nature != null)
				return false;
		} else if (!cod_decs_legal_nature.equals(other.cod_decs_legal_nature))
			return false;
		if (cod_desc_economy_activity == null) {
			if (other.cod_desc_economy_activity != null)
				return false;
		} else if (!cod_desc_economy_activity
				.equals(other.cod_desc_economy_activity))
			return false;
		if (registration_number == null) {
			if (other.registration_number != null)
				return false;
		} else if (!registration_number.equals(other.registration_number))
			return false;
		if (tradingName == null) {
			if (other.tradingName != null)
				return false;
		} else if (!tradingName.equals(other.tradingName))
			return false;
		return true;
	}
}
