<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../front/styles/registerStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="utf-8">
</head>
<body>
<!--<#include "nav_bar.jsp">-->
<form>
    <div class="containerForProfile">
        <img src="../../front/src/profilePic.PNG" id="profilePic" class="profilePic">
        <button class="buttonDone">Register</button>
    </div>
</form>

<form class="form-container">
    <div class="form-title"><h2>Fill in</h2></div>
    <div class="form-title">Login</div>
    <input class="form-field" id="login" type="text" name="login" required="required"/><br/>
    <div class="form-title">Password</div>
    <input class="form-field" id="password" type="text" name="password" required="required"/><br/>
    <div class="form-title">Email</div>
    <input class="form-field" id="email" type="text" name="email"/><br/>
    <div class="form-title">Age</div>
    <input class="form-field" id="age" type="text" name="age"/><br/>
    <div class="form-title">Country</div>
    <input class="form-field" id="country" type="text" name="country"/><br/>
</form>


</body>