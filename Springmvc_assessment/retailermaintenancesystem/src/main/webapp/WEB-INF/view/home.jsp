<%@page import="com.ustglobal.retailermaintenancesystem.dto.RetailerBean"%>
<%@page import="com.ustglobal.retailermaintenancesystem.dto.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<a href="./changepassword">Change Password</a>
	
	
	<a href="./logout">Logout</a>

	<h2>
		Welcome
		<%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td> Product ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="search"></td>
				</tr>

			</table>

		</form>
	</fieldset>
	<% 
	ProductBean productBean = (ProductBean)request.getAttribute("bean");
	%>

	<%
		if(productBean!=null){
	%>
	<table border="1px">
		<tr>
			<th>OrderId</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>


		</tr>

		<tr>
			<td><%=productBean.getOrderId()%></td>
			<td><%=productBean.getName()%></td>
			<td><%=productBean.getPrice()%></td>
			<td><%=productBean.getQuantity()%></td>
		</tr>

	</table>

	<%
		}
	%>
	<h3>${msg}</h3>

	

</body>
</html>