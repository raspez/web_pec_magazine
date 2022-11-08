package beans;

import java.io.Serializable;
import java.util.Objects;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@SessionScoped
@Named

public class LoginMB implements Serializable{
	private String login = null;
	private String userName;
	private String password;
	private boolean admin = false;
	
	public LoginMB() {
		userName = "";
		password = "";
	}

	public boolean isLogged() {
		return admin == true;
	}

	
	public String doLogin() {
		if(userName != null && !userName.isEmpty() ) {
			login = userName.toUpperCase();
			admin = true;
			return "articleMenu.xhtml";
		}
		return "";
			
	}
	
	public String logout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		admin = false;
		return "index.xhtml";
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}
}
