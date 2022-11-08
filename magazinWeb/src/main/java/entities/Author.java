package entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Author extends BaseEntity{
	
	private String authorName;
	private String authorEmail;
	private int authorPhone;
	
	@OneToMany(mappedBy = "articleAuthor")
	private List<Article> articles;
	
	
	
	public int getAuthorPhone() {
		return authorPhone;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public void setAuthorPhone(int authorPhone) {
		this.authorPhone = authorPhone;
	}
	
	public List<Article> getArticles(){
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
