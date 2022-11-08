package converters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import entities.Article;
import DTO.ArticleDTO;


@ApplicationScoped
@FacesConverter(forClass = Article.class, managed = true)
public class ArticleConverter implements Converter<Article>{
	@Inject
	private ArticleDTO articleDto;
	@Override
	public Article getAsObject(FacesContext context, UIComponent comp, String value) {
		if("null".equals(value)) {
			return null;
		}
		long id = Long.parseLong(value);
		return articleDto.find(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent comp, Article article) {
		if(article == null) {
			return "null";
		}
		return Long.toString(article.getId());
	}
}
