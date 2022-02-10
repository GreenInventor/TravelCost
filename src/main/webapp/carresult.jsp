<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Cost Results</title>
</head>
<body>
	<h1>Result:</h1>
	<p>People: ${carCost.getPeople()}<br />
	Miles Traveled: ${carCost.getMilesTraveled()}<br />
	Hours: ${carCost.getHours()}<br />
	Stops: ${carCost.getStops()}<br />
	Fuel Cost: ${carCost.getFuelTotal()}$<br />
	Food Cost: ${carCost.getFoodTotal()}$<br />
	Hotel Cost: ${carCost.getHotelTotal()}$<br />
	Total Cost: ${carCost.getCost()}$<br />
	</p>
	<br>
	<a href="index.jsp">Back to Home Page</a>
	<br><br>
	<a href="car.jsp">Calculate another trip</a>
</body>
</html>