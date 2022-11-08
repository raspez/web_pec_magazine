package entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Entity
public class Article extends TitleEntity {
	
	
	@Lob
    @Column(name = "articleText", columnDefinition="CLOB")
	private String articleText;

	@ManyToOne
	private Author articleAuthor;
    @ManyToOne
	private Issue articleIssue;
    @ManyToOne
 	private Theme articleTheme;
    

	public Theme getArticleTheme() {
		return articleTheme;
	}
	public void setArticleTheme(Theme articleTheme) {
		this.articleTheme = articleTheme;
	}
	public Author getArticleAuthor() {
		return articleAuthor;
	}
	public void setArticleAuthor(Author articleAuthor) {
		this.articleAuthor = articleAuthor;
	}
	
	public Issue getArticleIssue() {
		return articleIssue;
	}
	public void setArticleIssue(Issue articleIssue) {
		this.articleIssue = articleIssue;
	}
	
	


	public String getArticleText() {
		return articleText;
	}
	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}
}
