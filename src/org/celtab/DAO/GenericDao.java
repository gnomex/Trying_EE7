package org.celtab.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.celtab.domain.model.Bean;

public abstract class GenericDao<T extends Bean> implements Dao<T> {
    private final static String UNIT_NAME = "Marmots";
    
    @PersistenceContext(unitName = UNIT_NAME)
    private EntityManager em;
    
    private final Class<T> clazz;
        
	public GenericDao(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}
    
	@Override
	public T save(T t) {
//		checkNotNull(t, "Object (t) to save must not be null.");
		if (t.getId() != null) {
			t = em.merge(t);
		} else {
			em.persist(t);
		}
		return t;
	}

	@Override
	public List<T> findAll() {
		TypedQuery<T> q = em.createQuery(
				"select e from " + clazz.getSimpleName() + " e", clazz);
		return q.getResultList();
	}

	@Override
	public T find(Long id) {
//		checkNotNull(id, "Given ID must not be null.");
		return em.getReference(clazz, id);
	}

	@Override
	public void remove(T t) {
//		checkNotNull(t, "Object (t) to delete must not be null.");
		em.remove(t);
	}
}
