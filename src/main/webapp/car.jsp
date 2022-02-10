<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Travel Cost</title>
</head>
<body>
	<h1>Car Travel Cost</h1>
	<p>Please fill out the form to calculate an estimated cost of traveling by car.</p>
	<form action="getCarCostServlet" method="post">
		<div>
			<label for="milTraveled">Enter amount of miles traveling: </label>
			<input type="number" id="milTraveled" name="milTraveled">
		</div>
		<div>
			<label for="gasCost">Enter average cost of gas per gallon: </label>
			<input type="text" id="gasCost" name="gasCost">
		</div>
		<div>
			<label for="fuelEcon">Enter fuel economy of car your traveling with: </label>
			<input type="text" id="fuelEcon" name="fuelEcon">
		</div>
		<div>
			<label for="people">Enter amount of people who are traveling with you: </label>
			<input type="number" id="people" name="people">
		</div>
		<div>
			<label for="tripAcc">Choose a level of spending on food and accommodations during trip:</label>
			<select id="tripAcc" name="tripAcc">
				<option value="1">$</option>
				<option value="2">$$</option>
				<option value="3">$$$</option>
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