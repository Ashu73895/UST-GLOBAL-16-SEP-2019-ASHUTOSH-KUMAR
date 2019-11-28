<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request" />
<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>



<body>
	<h4><%=msg%></h4>
	<fieldset align='center'>
		<legend>Welcome to Login page</legend>
		<form action='./login' method='post'>
			<table>
				<tr>
					<td>Id:</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
					<td>Remember me</td>
				</tr>
				<tr>
					<td><input type='reset' value='Reset'></td>
					<td><input type='submit' value='Login'></td>
				</tr>
				<tr>
					<a href='register.html'>Click here to register</a>
				</tr>
			</table>
			<a href='register.html'>Click here to register</a>
		</form>
	</fieldset>


</body>
</html>