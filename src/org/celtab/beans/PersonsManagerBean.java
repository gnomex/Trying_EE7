package org.celtab.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.celtab.domain.person.Person;

@Stateless
public class PersonsManagerBean {

	@PersistenceUnit
	private EntityManagerFactory emFactory;
	private EntityManager em;

	@PostConstruct
	private void init() {
		em = emFactory.createEntityManager();
	}

	public Person updateItem(Person person) {
		em.joinTransaction();
		em.merge(person);
		return person;
	}

	@PreDestroy
	private void cleanup() {
		if(em.isOpen()) {
			em.close();
		}
	}
}
