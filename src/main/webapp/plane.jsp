<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plane Travel Cost</title>
</head>
<body>
	<h1>Plane Travel Cost</h1>
	<p>Please fill out the form to calculate an estimated cost of traveling by plane.</p>
	<form action="getPlaneCostServlet" method="post">
		<div>
			<label for="milTraveled">Enter amount of miles traveling: </label>
			<input type="number" id="milTraveled" name="milTraveled">
		</div>
		<div>
			<label for="people">Enter amount of people who are traveling with you: </label>
			<input type="number" id="people" name="people">
		</div>
		<div>
			<label for="tripAcc">Choose a seat type for all passengers:</label>
			<select id="tripAcc" name="tripAcc">
				<option value="1">Economy</option>
				<option value="2">Business</option>
				<option value="3">First Class</option>
			</select>
		</div>
		<div>
			<label for="flightType">What type of flight is this:</label>
			<select id="flightType" name="flightType">
				<option value="1">Domestic</option>
				<option value="2">International</option>
			</select>
		</div>
		<div>
			<input type="submit" id="submit" value="Calculate Cost">
	        <input type="reset" id="reset" value="Reset">
		</div>
	</form>
	<br>
	<a href="index.jsp">Back to Home Page</a>
</body>
</html>