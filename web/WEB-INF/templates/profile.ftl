<html>
<head>
    <link rel="stylesheet" href="../../front/styles/profileStyles.css" type="text/css"/>
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
<link rel="stylesheet" href="../../front/styles/navBarStyles.css" type="text/css"/>
<#include "nav_bar.jsp">

<#--<div class="form-container"-->
<#--<div class="row">-->
<#--<div class="class=" col-md-4>-->
<#--<div class="form-title">Email</div>-->
<#--<h4 class="form-field" id="email" type="text" name="email">${user.getEmail()}</h4><br/>-->
<#--<div class="form-title">Age</div>-->
<#--<h4 class="form-field" id="age" type="text" name="age">${user.getAge()} years</h4><br/>-->
<#--<div class="form-title">Country</div>-->
<#--<h4 class="form-field" id="country" type="text" name="country">${user.getCountry()}</h4><br/>-->
<#--</div>-->


<#--<div class="col-md-4">-->
<#--<img name="avatar" src="../../front/src/avatars/${user.getAvatar()}" class="closePic" width="150" height="250">-->
<#--</div>-->
<#--</div>-->
<div class="form-container">
    <div class="row">
        <div class="col-md-6">
            <form role="form" method="post">
                <img name="avatar" src="../../front/src/avatars/${user.getAvatar()}" class="closePic" width="150"
                     height="250">

            </form>
        </div>

        <div class="col-md-6">
            <form role="form">
                <div class="form-title">Email</div>
                <h4 class="form-field" id="email" type="text" name="email">${user.getEmail()}</h4><br/>
                <div class="form-title">Age</div>
                <h4 class="form-field" id="age" type="text" name="age">${user.getAge()} years</h4><br/>
                <div class="form-title">Country</div>
                <h4 class="form-field" id="country" type="text" name="country">${user.getCountry()}</h4><br/>
            </form>
        </div>
    </div>
</div>

</div>
</body>
</html>
