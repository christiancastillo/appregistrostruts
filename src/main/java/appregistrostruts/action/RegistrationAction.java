package appregistrostruts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import appregistrostruts.form.RegistrationFormAction;
import appregistrostruts.services.LoginService;

public class RegistrationAction extends Action{
	 @Override
	 public ActionForward execute(ActionMapping mapping, ActionForm form,
			 HttpServletRequest request, HttpServletResponse response)
	   throws Exception {
	  RegistrationFormAction regForm=(RegistrationFormAction) form;
	  LoginService loginService= new LoginService();
	  
	  try
	  {
	   if(loginService.addLogin(regForm))
	    return mapping.findForward("success");
	   else
	    return mapping.findForward("failure");
	  }
	  catch (Exception e)
	  {
	   return mapping.findForward("failure");
	  }
	 
	 }
}
