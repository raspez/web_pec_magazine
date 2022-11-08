package entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Issue extends TitleEntity{
	

	
	@OneToMany(mappedBy = "articleIssue")
	private List<Article> articles;
	


	public List<Article> getArticles(){
		return articles;
	}
	
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
