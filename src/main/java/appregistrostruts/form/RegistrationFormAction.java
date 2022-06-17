package appregistrostruts.form;

import org.apache.struts.action.ActionForm;

public class RegistrationFormAction extends ActionForm{
	private static final long serialVersionUID = 1L;
	private String username = null;
	private String paswd = null;
	  
	public String getUsername() {
		return username;
	}
	  
	public void setUsername(String username) {
		this.username = username;
	}
	  
	public String getpaswd() {
		return paswd;
	}
	  
	public void setpaswd(String paswd) {
		this.paswd = paswd;
	}
}
