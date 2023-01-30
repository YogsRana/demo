<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title> Validate the Password </title>
<style> 
Body {
  font-family: Calibri, Helvetica, sans-serif;
 }
button { 
       background-color: Black; 
       width: 100%;
        color: orange; 
        padding: 15px; 
        margin: 10px 0px; 
        border: none; 
        cursor: progress; 
         } 
 form { 
        border: 3px solid #f1f1f1; 
    } 
 input[type=email], input[type=password] { 
        width: 100%; 
        margin: 8px 0;
        padding: 12px 20px; 
        display: inline-block; 
        border: 2px solid green; 
        box-sizing: border-box; 
    }
 button:hover { 
        opacity: 0.7; 
    } 
  .cancelbtn { 
        width: auto; 
        padding: 10px 18px;
        margin: 10px 5px;
    } 
      .container { 
        padding: 25px; 
        background-color: lightblue;
    } 
</style> 
</head>

<script>
function validateForm() {
    //collect form data in JavaScript variables
    var pw1 = document.getElementById("pswd1").value;
    var pw2 = document.getElementById("pswd2").value;
    var email1 = document.getElementById("emailadd").value;
    
        //check empty first name field
    if(email1 == "") {
      document.getElementById("blankMsg").innerHTML = "**Fill the email";
      return false;
    }
    
    //character data validation
    if(!isNaN(email1)){
      document.getElementById("blankMsg").innerHTML = "**Only characters are allowed";
      return false;
    }
  
    //check empty password field
    if(pw1 == "") {
      document.getElementById("message1").innerHTML = "**Fill the password please!";
      return false;
    }
  
    //check empty confirm password field
    if(pw2 == "") {
      document.getElementById("message2").innerHTML = "**Enter the password please!";
      return false;
    } 
   
    //minimum password length validation
    if(pw1.length < 4) {
      document.getElementById("message1").innerHTML = "**Password length must be atleast 4 characters";
      return false;
    }

    //maximum length of password validation
    if(pw1.length > 10) {
      document.getElementById("message1").innerHTML = "**Password length must not exceed 10 characters";
      return false;
    }
  
    if(pw1 != pw2) {
      document.getElementById("message2").innerHTML = "**Passwords are not same";
      return false;
    } else {
      alert ("Your password created successfully");
    //  document.write("JavaScript form has been submitted successfully");
    }
 }
</script>
<body>

<form onsubmit="return validateForm()" action="validation" method="post">
<h1 align="center" style="color:green">Create New User</h1>
<div class="container"> 
<td> User Name* </td>
<input type ="email" id ="emailadd" value = "" name="username" placeholder="user_name"> 
<span id = "blankMsg" style="color:red"> </span> <br><br>


<!-- Create a new password -->
<td> Create Password* </td>
 <input type="password" id="pswd1" value ="" name="password" placeholder="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,10}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters" >

<!-- <input type = "password" id = "pswd1" value = "">  -->
<span id = "message1" style="color:red"> </span> <br><br>

<!-- <!?Enter confirm password -->
<td> Confirm Password* </td>
<input type = "password" id = "pswd2" value = "" placeholder="Confirm Password"> 
<span id = "message2" style="color:red"> </span> <br><br>

<!-- Click to verify valid password -->
<button type ="submit" value ="submit" >Submit</button>

<!-- Click to reset fields -->
<button type = "reset" value = "Reset" >Reset</button>
</div>
</form>
</body>
</html> 

 
