package org.celtab.domain.person;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.celtab.domain.documents.RegisterDocument;

@Entity
public class Natural extends Person {

	private static final long serialVersionUID = 1L;

	private java.util.Date birthDate;
	private String surname;
	private String MotherName;
	private String FatherName;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Gender gender;
	
	private List<RegisterDocument> documents;
	
////	TODO: If br: the RG is defined, but is no br: we need to define the RNE, how ?
//	@OneToOne(orphanRemoval=true)
//	private RG rg;
//	@OneToOne(orphanRemoval=true)
//	private CPF cpf;

	public java.util.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<RegisterDocument> getDocuments() {
		return documents;
	}

	public void setDocuments(List<RegisterDocument> documents) {
		this.documents = documents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((FatherName == null) ? 0 : FatherName.hashCode());
		result = prime * result
				+ ((MotherName == null) ? 0 : MotherName.hashCode());
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result
				+ ((documents == null) ? 0 : documents.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Natural other = (Natural) obj;
		if (FatherName == null) {
			if (other.FatherName != null)
				return false;
		} else if (!FatherName.equals(other.FatherName))
			return false;
		if (MotherName == null) {
			if (other.MotherName != null)
				return false;
		} else if (!MotherName.equals(other.MotherName))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (documents == null) {
			if (other.documents != null)
				return false;
		} else if (!documents.equals(other.documents))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
}
