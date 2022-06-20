<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete page</title>
</head>
<body>
<form action="/delete">
Enter the Recipe Id:<input type=text name=id>
<button onclick="myFunction()">Delete</button>
<p id="demo"></p>

<script>
function myFunction() {
  location.href = "http://localhost:9011/";
}
</script> 
</form>

</body>
</html>