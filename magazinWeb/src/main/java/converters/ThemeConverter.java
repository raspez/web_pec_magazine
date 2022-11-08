package converters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import entities.Theme;
import DTO.ThemeDTO;


@ApplicationScoped
@FacesConverter(forClass = Theme.class, managed = true)
public class ThemeConverter implements Converter<Theme>{
	@Inject
	private ThemeDTO themeDTO;
	@Override
	public Theme getAsObject(FacesContext context, UIComponent comp, String value) {
		if("null".equals(value)) {
			return null;
		}
		long id = Long.parseLong(value);
		return themeDTO.find(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent comp, Theme theme) {
		if(theme == null) {
			return "null";
		}
		return Long.toString(theme.getId());
	}
}
