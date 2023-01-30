<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
form  { 
        border: 3px solid #f1f1f1; 
    } 
</style>
<body>
<h1>forget</h1>
${message }
 <form action="validation3" method="get">
            <label>Username : </label> <br>
            <input type="text" placeholder="Enter Username" name="username" required><br>
            <label>Password : </label> <br>
            <input type="password" placeholder="Enter Password" name="password"  required><br>
             <button type="submit">save</button> <br>
            <button type="reset" value="Reset">clear</button> 
            </form> 
</body>
</html>