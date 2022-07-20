<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success!</title>
</head>
<body>

<h1>Hotel successfully added.</h1>

<br><br>
Name: ${newName}<br>
City: ${newCity}<br>
Price per Night: ${newPrice}<br><br>

<a href="/">Go back home</a>


</body>
</html>