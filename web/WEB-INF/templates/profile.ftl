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


<form class="form-container">
    <div class="form-title">Email</div>
    <h4 class="form-field" id="email" type="text" name="email">some email</h4><br/>
    <div class="form-title">Age</div>
    <h4 class="form-field" id="age" type="text" name="age">18189 years</h4><br/>
    <div class="form-title">Country</div>
    <h4 class="form-field" id="country" type="text" name="country">some country</h4><br/>
</form>
<a href="/newpost" class="submit-button" style="margin-left:840px">Add new post</a>
<form>
    <div class="containerForProfile">
        <img src="../../front/src/profilePic.PNG" id="profilePic" class="profilePic">
        <div class="editButton-place"><a href="edit.ftl" class="buttonEdit">Edit</a></div>
    </div>
</form>

<div class="container post" align="center">

<#if posts?has_content>
    <#list posts as item>
        <div class="row">
            <div class="posts_place">
                <h1 align="center">Title</h1>
                by ${item.getAuthor()}
                <br>
                ${item.getDate_create()}
                <h5>
                    ${item.getText()}
                </h5>
            </div>
        </div>
    </#list>
</#if>
</div>


</body>
</html>
