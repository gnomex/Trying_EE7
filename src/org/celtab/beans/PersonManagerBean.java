package org.celtab.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonManagerBean {

	@PersistenceContext
	private EntityManager em;
	
	
}
