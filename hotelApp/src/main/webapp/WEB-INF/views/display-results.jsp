<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>
Hotels in ${displayCity}:
<ol>
<c:forEach var="variable" items="${hotelList}">
<li>
${variable.name} - ${variable.pricePerNight}
</li>
</c:forEach>
</ol>

<a href="/">Back home</a>


</body>
</html>