package DTO;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entities.Article;

@ApplicationScoped
public class ArticleDTO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Article> getAllArticles(){
		List<Article> articles =  em.createQuery("select ar from Article ar", Article.class).getResultList();
		return articles;
	}
	
	@Transactional
	public Article save(Article ar) {
		if(ar.getId() == 0) {
			em.persist(ar);
			return ar;
		} else {
			return em.merge(ar);
		}
	}
	public Article find(long id) {
		return em.find(Article.class, id);
	}
}


//return em.createQuery("select a from Article a", Article.class).getResultList();