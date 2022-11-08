package controlers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import DTO.ThemeDTO;
import entities.Theme;

@Named
@SessionScoped
public class ThemeController implements Serializable {

	private static final long serialVersionUID = 1550248715502601660L;

	private Theme editedTheme;
	
	@Inject
	private ThemeDTO themeDTO;
	

	public Theme getEditedTheme() {
		return editedTheme;
	}

	public void setEditedTheme(Theme editedTheme) {
		this.editedTheme = editedTheme;
	}

	public String save() {
		themeDTO.save(editedTheme);
		return "themeMenu";
	}
	
	public String edit(Theme theme) {
		editedTheme = theme;
		return "themeMenu";
	}
	
	
	public String newTheme() {
		editedTheme = new Theme();
		return "themeAdd";
	}

	public List<Theme> getAllThemes() {
		return themeDTO.getAllThemes();
	}
	
	
	
	
	
}
