package org.celtab.domain.person;

import javax.persistence.Entity;

import org.celtab.domain.model.TimeStampedBean;

@Entity
public class Gender extends TimeStampedBean {

	private static final long serialVersionUID = 1L;
	
	private GenderType gender;

	public GenderType getType() {
		return gender;
	}

	public void setType(GenderType type) {
		this.gender = type;
	}

	@Override
	public String toString() {
		return "Gender [gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
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
		Gender other = (Gender) obj;
		if (gender != other.gender)
			return false;
		return true;
	}


}
