<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="msg" class="java.lang.String" scope = "request"/>

</head>
<body>
<a href="./home">Home</a><a style = "float:right" href="./logout">Logout</a>
<h4><%=msg %></h4>


<fieldset align = "center">
<legend>Change Password</legend>
<form action="./changepassword" method = "post">
<table align = "center">
<tr>
<td>New Password</td>
<td><input type ="password" name = "password"></td>

</tr>

<tr>
<td>Confirm Password</td>
<td><input type ="password" name = "confirmpassword"></td>

</tr>



<tr>
<td><input type = "reset" value = "Reset"></td>
<td><input type ="submit" name = "Change password"></td>

</tr>

</table>
</form>
</fieldset>

</body>
</html>