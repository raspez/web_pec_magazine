package controlers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import DTO.AuthorDTO;
import entities.Author;

@Named
@SessionScoped
public class AuthorController implements Serializable {

	private static final long serialVersionUID = 1160127918252766524L;
	
	private Author editedAuthor;
	
	@Inject
	private AuthorDTO authorDTO;
	

	public Author getEditedAuthor() {
		return editedAuthor;
	}

	public void setEditedAuthor(Author editedAuthor) {
		this.editedAuthor = editedAuthor;
	}

	public String save() {
		authorDTO.save(editedAuthor);
		return "authorMenu";
	}
	
	public String edit(Author author) {
		editedAuthor = author;
		return "authorEdit";
	}
	
	
	public String newAuthor() {
		editedAuthor = new Author();
		return "authorAdd";
	}

	public List<Author> getAllAuthors() {
		return authorDTO.getAllAuthors();
	}
	
	
	
	
	
}
