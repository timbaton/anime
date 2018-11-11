<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../front/styles/editStyle.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<meta charset="utf-8">

<body>
<#include "nav_bar.jsp">

<form class="form-container" method="post" enctype="multipart/form-data">

    <div class="row">
        <div class="col-md-6" align="center">
            <img name="avatar" src="../../front/src/avatars/${user.getAvatar()}" class="closePic" width="150"
                 height="250">
            <br>
            <input type="file" size="30" name="file" accept=".jpg, .jpeg"></p>
            <input type="submit" value="save photo">
        </div>

        <div class="col-md-6">
            <div class="form-title"><h2>Fill in</h2></div>
            <div class="form-title">Email</div>
            <input class="form-field" id="email" type="text" name="email"/><br/>
            <div class="form-title">Age</div>
            <input class="form-field" id="age" type="text" name="age"/><br/>
            <div class="form-title">Country</div>
            <input class="form-field" id="country" type="text" name="country"/><br/>

            <input type="submit" class="buttonDone"/>
        </div>
    </div>

</form>


</body>
</html>
