package entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Theme extends BaseEntity{
	
	private String themeName;

	
	@OneToMany(mappedBy = "articleTheme")
	private List<Article> articles;
	
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	
	public List<Article> getArticles(){
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
