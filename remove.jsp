<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="login.css">
<title>Remove plant</title>
</head>
<body>
<div class="container">
<h2>Remove Plant</h2>
        <form id="RemoveForm" action="RemoveServlet" method="post">
        	<label for="username">UserName:</label>
            <input type="text" name="username" id="username" value=<%= request.getParameter("value") %> readonly>
            <label for="plantId">Plant Id:</label>
            <input type="text" name="plantId" id="plantId" required>

            <button type="submit">Remove Plant</button>
        </form>
</div>
</body>
</html>