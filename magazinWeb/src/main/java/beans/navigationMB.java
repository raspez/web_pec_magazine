package beans;

import java.io.Serializable;
import java.util.Objects;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@SessionScoped
@Named


public class navigationMB implements Serializable{


	
	public String backToMenu(){
		return "menu.xhtml";
	}
//Issues
	public String issueMenu(){
		return "issueMenu.xhtml";
	}
	
	public String issueAdd(){
		return "issueAdd.xhtml";
	}

	public String issueEdit() {
		return "issueEdit.xhtml";
	}
	public String backIssue() {
		return "issueMenu.xhtml";
	}
	
//Articles
	public String articlesMenu(){
		return "articleMenu.xhtml";
	}
	
	public String articleAdd(){
		return "articleAdd.xhtml";
	}
	
	public String articleEdit(){
		return "articleEdit.xhtml";
	}

	public String articleList() {
		return "articleList.xhtml";
	}
	public String articleRead() {
		return "articleRead.xhtml";
	}
	public String backArticle() {
		return "articleMenu.xhtml";
	}
	
//Authors
	public String authorMenu(){
		return "authorMenu.xhtml";
	}	
	
	public String authorAdd(){
		return "authorAdd.xhtml";
	}
	
	public String authorEdit(){
		return "authorEdit.xhtml";
	}
	public String backAuthor() {
		return "authorMenu.xhtml";
	}
	
//Themes
	public String themeMenu(){
		return "themeMenu.xhtml";
	}	
	
	public String themeAdd(){
		return "themeAdd.xhtml";
	}
	
	public String backTheme() {
		return "themeMenu.xhtml";
	}

	
	
	
}
