<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../front/styles/registerStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<meta charset="utf-8">

<body>
<!--<#include "nav_bar.jsp">-->
<form>
    <div class="containerForProfile">
        <img src="../../front/src/profilePic.PNG" id="profilePic" class="profilePic">
    </div>
</form>

<form class="form-container" method="post">
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

    <input type="submit" class="buttonDone"/>
</form>


</body>
</html>
