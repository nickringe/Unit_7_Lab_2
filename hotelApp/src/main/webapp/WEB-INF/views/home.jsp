<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Search Home Page</title>
</head>
<body>

Select a City to stay in: 

<%-- <form action="/search" method="post">
<select>
<c:forEach var="stuff" items="${nothingspecific}">
<option value="${stuff.city}" > ${stuff.city}</option>
</c:forEach>
</select>
<input type="submit">
</form> --%>

<form action="/search" method="post">
<select name="city" id="city">

<option value="Jackson">Jackson</option>
<option value="Ann Arbor" >Ann Arbor</option>
<option value="Detroit" >Detroit</option>
<option value="Allentown" >Allentown</option>

</select>
<input type="submit">
</form>





</body>
</html>