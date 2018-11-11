<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../../front/styles/addStyles.css" type="text/css"/>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<#include "nav_bar.ftl">

<form class="form-container" method="post">
    <div class="form-title"><h2>Write your post here</h2></div>
    <textarea maxlength="400" cols="40" rows="9" name="text" ></textarea>
    <div class="addButtonContainer">
        <!--<a href="profile.html" class="addButton" >Add</a>-->
        <input type="submit" class="addButton"/>
    </div>
</form>
</body>
</html>