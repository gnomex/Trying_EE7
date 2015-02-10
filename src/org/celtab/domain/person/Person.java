package org.celtab.domain.person;

import java.util.Collection;

import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.celtab.domain.address.EspecificAddress;
import org.celtab.domain.contacts.Email;
import org.celtab.domain.contacts.Phone;
import org.celtab.domain.model.TimeStampedBean;

/*@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type", discriminatorType=DiscriminatorType.STRING)*/
@MappedSuperclass
public abstract class Person extends TimeStampedBean {
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	private Collection<Phone> phones;

	private Collection<Email> emails;

	@OneToOne
	private EspecificAddress address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany
	@JoinColumn(name="owner_id", referencedColumnName="id")
	public Collection<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}

	@OneToMany
	@JoinColumn(name="owner_id", referencedColumnName="id")
	public Collection<Email> getEmails() {
		return emails;
	}

	public void setEmails(Collection<Email> emails) {
		this.emails = emails;
	}

	public EspecificAddress getAddress() {
		return address;
	}

	public void setAddress(EspecificAddress address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((emails == null) ? 0 : emails.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phones == null) ? 0 : phones.hashCode());
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
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (emails == null) {
			if (other.emails != null)
				return false;
		} else if (!emails.equals(other.emails))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phones == null) {
			if (other.phones != null)
				return false;
		} else if (!phones.equals(other.phones))
			return false;
		return true;
	}
}
