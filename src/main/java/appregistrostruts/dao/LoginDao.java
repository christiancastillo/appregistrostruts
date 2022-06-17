package appregistrostruts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import appregistrostruts.form.RegistrationFormAction;
import appregistrostruts.utilities.DBUtilities;

public class LoginDao {
	public boolean addLogin(RegistrationFormAction regForm) throws SQLException
	{
		Connection con=null;
		boolean access=false;
		
		try
		{
			con=DBUtilities.getConnection();	   
			String query= "insert into login values (?,?)";
			PreparedStatement stmt= con.prepareStatement(query);
			stmt.setString(1, regForm.getUsername());
			stmt.setString(2, regForm.getpaswd());
			int result= stmt.executeUpdate();	   
			if(result>0)
			{
				access=true;
			}
	  }
	  finally
	  {
	   DBUtilities.closeConnection(con);
	  }
	  return access;
	 }
	}
