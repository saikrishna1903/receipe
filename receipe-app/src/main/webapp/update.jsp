<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/update">
<table>
<tr><th>Enter the Recipe Id:</th><th><input type=text name=id></th></tr>

<tr><th>Name of the Recipe</th><th><input type=text name="name"></th></tr>
<tr><th>Date and time of its Creation</th><th><input type=text name="DateTime"></th></tr>
<tr><th>Type of Dish</th><th><input type=text name="TypeOfDish"></th></tr>
<tr><th>Serves For </th><th><input type=text name="SuitableFor"></th></tr>
<tr><th>Ingredients</th><th><input type=text name="Ingredients"></th></tr>
<tr><th>CookingInstructions</th><th><input type=text name="CookingInstructions"></th></tr>
<tr><th><input type=submit></th></tr>
</table>
<button onclick="myFunction()">Update</button>
</form>
<p id="demo"></p>

<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "UPDATED!";
}
</script>
</body>
</html>