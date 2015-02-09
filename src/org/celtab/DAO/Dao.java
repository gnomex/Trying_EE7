package org.celtab.DAO;

import java.util.List;

import org.celtab.domain.model.Bean;

public interface Dao<T extends Bean> {
	public T save(T t); //Create new or update a existing entity
	public List<T> findAll(); //Get all entities
	public void remove(T t); //Remove
	public T find(Long id); //Find a specific entity  
}
