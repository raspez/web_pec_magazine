package controlers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import DTO.ArticleDTO;
import entities.Article;

@Named
@SessionScoped
public class ArticleController implements Serializable {


	private static final long serialVersionUID = 6386745500524010336L;
	private Article editedArticle;

	@Inject
	private ArticleDTO articleDTO;

	public Article getEditedArticle() {
		return editedArticle;
	}

	public void setEditedArticle(Article editedArticle) {
		this.editedArticle = editedArticle;
	}

	public ArticleDTO getArticleDto() {
		return articleDTO;
	}

	public String save() {
		articleDTO.save(editedArticle);
		return "articleMenu";
	}

	public String read(Article article) {
		editedArticle = article;
		return "articleRead";
	}
	public String edit(Article article) {
		editedArticle = article;
		return "articleEdit";
	}

	public String newArticle() {
		editedArticle = new Article();
		return "articleAdd";
	}

	public List<Article> getAllArticles() {
		return articleDTO.getAllArticles();
	}

}
