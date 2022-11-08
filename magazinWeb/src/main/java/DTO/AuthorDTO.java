package DTO;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entities.Author;

@ApplicationScoped
public class AuthorDTO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Author> getAllAuthors(){
		List<Author> authors =  em.createQuery("select a from Author a", Author.class).getResultList();
		return authors;
	}
	
	@Transactional
	public Author save(Author a) {
		if(a.getId() == 0) {
			em.persist(a);
			return a;
		} else {
			return em.merge(a);
		}
	}

	public Author find(long id) {
		return em.find(Author.class, id);
	}
}
