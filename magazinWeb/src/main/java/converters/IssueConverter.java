package converters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import entities.Issue;
import DTO.IssueDTO;

@ApplicationScoped
@FacesConverter(forClass = Issue.class, managed = true)
public class IssueConverter implements Converter<Issue> {
	@Inject
	private IssueDTO issueDTO;
	@Override
	public Issue getAsObject(FacesContext context, UIComponent comp, String value) {
		if("null".equals(value)) {
			return null;
		}
		long id = Long.parseLong(value);
		return issueDTO.find(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent comp, Issue issue) {
		if(issue == null) {
			return "null";
		}
		return Long.toString(issue.getId());
	}

}
