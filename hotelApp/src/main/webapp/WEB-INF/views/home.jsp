<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Search Home Page</title>
</head>
<body>

<br>
Select a City to stay in:
<br>

<form action="/search" method="post">
<select name="city" id="city">

<option value="Jackson">Jackson</option>
<option value="Ann Arbor" >Ann Arbor</option>
<option value="Detroit" >Detroit</option>
<option value="Allentown" >Allentown</option>

</select>
<input type="submit">
</form>
<br>
Find hotels by max price:
<form action="/max" method="post">
<input type="number" name="maxPrice" />
<input type="submit">
</form>

<br>
Add hotels to the database:

<form action="/add" method="post">
<input type="hidden" name="id" />
<select name="city" id="city">
<option value="Jackson">Jackson</option>
<option value="Ann Arbor" >Ann Arbor</option>
<option value="Detroit" >Detroit</option>
<option value="Allentown" >Allentown</option>
</select>

<input type="text" name="name" value="Enter Hotel Name" required/>
<input type="number" name="pricePerNight" min="0" placeholder="Enter Price Per Night" required/> 
<input type="submit" value="Add Hotel">
</form>




</body>
</html>