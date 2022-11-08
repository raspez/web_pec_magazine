package DTO;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entities.Theme;

@ApplicationScoped
public class ThemeDTO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Theme> getAllThemes(){
		List<Theme> themes =  em.createQuery("select t from Theme t", Theme.class).getResultList();
		return themes;
	}
	
	@Transactional
	public Theme save(Theme t) {
		if(t.getId() == 0) {
			em.persist(t);
			return t;
		} else {
			return em.merge(t);
		}
	}

	public Theme find(long id) {
		return em.find(Theme.class, id);
	}
}
