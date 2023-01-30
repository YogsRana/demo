<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style> 
Body {
  font-family: Calibri, Helvetica, sans-serif;
 }
 form  { 
        border: 3px solid #f1f1f1; 
    } 
 .container { 
        padding: 30px; 
        background-color: lightblue;
    } 
</style> 
<body>
<form action="validation1" method="post" align="center">
<div class="container"> 
<h4 align="center">registration form<br><br>

<label align="center">f_name</label><br>
<input type="text" name="f_name" placeholder="f_name" required><br>

<label>l_name</label><br>
<input type="text" name="l_name" placeholder="l_name" required><br>
 
 <label>email</label><br>
 <input type="email" id="email" name="email" placeholder="email" required><br>
  
 <lable>mobile_no</lable><br>
 <select> <option> select </option><option> +91 </option> <option>+92</option> <option>+93</option><option>+94</option>
 <option>+95</option><input type="number" value="" placeholder="943*******" required="required" minlength="10" maxlength="10" autofocus=""/>
 </select><br/>
     
  <label>gender</label>
                <input type="radio" name="gender" value="male" required>male
                <input type="radio" name="gender" value="female" required>female <br>
 <lable>age</lable><br>
                <input type="number" name="age" placeholder="age" required min="18" max="35" required><br>
                  <label>dob</label><br>
                <input type="Date" name="dob" placeholder="dob" required><br>
                       
 <lable>Programing language</lable>
                <input type="checkbox" value="java">java 
                <input type="checkbox" value="python">python 
                <input type="checkbox" value="php">php 
                <input type="checkbox" value="sql">sql<br>
  <lable>resume:</lable>
                <input type="file" value="upload file" required><br> <br>
                <input type="submit" value="submit">
                <input type="reset" value="reset">
                </h4>
                </div>
</form>
</body>
</html>