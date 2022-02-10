<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plane Cost Results</title>
</head>
<body>
	<h1>Result:</h1>
	<p>People: ${planeCost.getPeople()}<br />
	Miles Traveled: ${planeCost.getMilTraveled()}<br />
	Hours: ${planeCost.getHours()}<br />
	Flight Cost: ${planeCost.getFlightCost()}$<br />
	Food Cost: ${planeCost.getFoodCost()}$<br />
	Total Cost: ${planeCost.getCost()}$<br />
	</p>
	<br>
	<a href="index.jsp">Back to Home Page</a>
	<br><br>
	<a href="plane.jsp">Calculate another trip</a>
</body>
</html>