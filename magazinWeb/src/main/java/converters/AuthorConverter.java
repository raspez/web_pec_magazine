package converters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import entities.Author;
import DTO.AuthorDTO;


@ApplicationScoped
@FacesConverter(forClass = Author.class, managed = true)
public class AuthorConverter implements Converter<Author>{
	@Inject
	private AuthorDTO authorDTO;
	@Override
	public Author getAsObject(FacesContext context, UIComponent comp, String value) {
		if("null".equals(value)) {
			return null;
		}
		long id = Long.parseLong(value);
		return authorDTO.find(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent comp, Author author) {
		if(author == null) {
			return "null";
		}
		return Long.toString(author.getId());
	}
}
