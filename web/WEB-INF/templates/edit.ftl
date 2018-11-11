<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../front/styles/editStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<meta charset="utf-8">
<body>
<#include "nav_bar.jsp">

<link rel="stylesheet" href="../../front/styles/navBarStyles.css" type="text/css"/>


<form class="form-container" method="post">
    <div class="containerForProfile">
        <img src="../../front/src/profilePic.PNG" id="profilePic" class="profilePic">
        <input type="submit" class="buttonDone"/>
        <img name="avatar" src="../../front/src/img_avatar.png" class="closePic" width="150" height="150">
        <br>
        <input style="margin-top: 20px; margin-left: 100px" id="file" type="file"
               accept="image/jpeg, image/png, image/jpg" name="file"/>
    </div>

    <div>
        <form class="form-container">
            <div class="form-title">Email</div>
            <input class="form-field" id="emailEdit" type="text" name="email" required="required"/><br/>
            <div class="form-title">Age</div>
            <input class="form-field" id="ageEdit" type="text" name="age"/><br/>
            <div class="form-title">Country</div>
            <input class="form-field" id="countryEdit" type="text" name="country"/><br/>
        </form>
    </div>
</form>
</body>
</html>