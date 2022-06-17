package appregistrostruts.services;

import java.sql.SQLException;

import appregistrostruts.dao.LoginDao;
import appregistrostruts.form.RegistrationFormAction;

public class LoginService {
 LoginDao loginDao = new LoginDao();
 
 public boolean addLogin(RegistrationFormAction regForm) throws SQLException
 {
  if(loginDao.addLogin(regForm))
   return true;
  else
   return false;
 }
}

