<%@page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Registration Form</title>
	</head>
	<body>
		<center>
			<h1>Registration Form </h1>
		<html:form action="/register" >
 			Username : <html:text property="username"/><br/>
 			<br/>
 			Password : <html:password property="paswd"/><br/>
 			<br/>
 			<html:submit value="Register" />
		</html:form>
		</center>
	</body>
</html>