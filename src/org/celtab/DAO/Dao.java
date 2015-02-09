package org.celtab.DAO;

import java.util.List;

import org.celtab.domain.model.Bean;

public interface Dao<T extends Bean> {
	public T save(T t);
	public List<T> findAll();
	public void remove(T t);
	public T find(Long id);
}
