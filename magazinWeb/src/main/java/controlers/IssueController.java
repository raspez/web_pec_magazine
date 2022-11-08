package controlers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Issue;
import DTO.IssueDTO;

@Named
@SessionScoped
public class IssueController implements Serializable {

	private static final long serialVersionUID = -7137083795613429867L;

	private Issue editedIssue;
	
	@Inject
	private IssueDTO issueDTO;
	
	public Issue getEditedIssue() {
		return editedIssue;
	}

	public void setEditedIssue(Issue editedIssue) {
		this.editedIssue = editedIssue;
	}

	public String save() {
		issueDTO.save(editedIssue);
		return "issueMenu";
	}
	
	public String edit(Issue issue) {
		editedIssue = issue;
		return "issueEdit";
	}
	
	
	public String newIssue() {
		editedIssue = new Issue();
		return "issueAdd";
	}

	public List<Issue> getAllIssues() {
		return issueDTO.getAllIssues();
	}
	
}
