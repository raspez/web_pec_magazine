package DTO;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entities.Issue;

@ApplicationScoped
public class IssueDTO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Issue> getAllIssues(){
		List<Issue> issues =  em.createQuery("select i from Issue i", Issue.class).getResultList();
		return issues;
	}
	
	@Transactional
	public Issue save(Issue i) {
		if(i.getId() == 0) {
			em.persist(i);
			return i;
		} else {
			return em.merge(i);
		}
	}

	public Issue find(long id) {
		return em.find(Issue.class, id);
	}
}
