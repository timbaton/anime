<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../../front/styles/navBarStyles.css" type="text/css"/>
    <link rel="stylesheet" href="../../front/styles/favouriteStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
</head>
<body>
    <#include "nav_bar.ftl">
<form class="form-container" method="get">
    <input class="form-control" type="text" placeholder="Search" aria-label="Search" name="search">
</form>

<#if posts?has_content>
    <#list posts as item>
        <div class="animeBlock">

            <div class="animePic"><img src="../../front/src/avatars/${item.getAuthorAvatar()}" height="80" width="90">
                <div class="animeName">${item.getDate_create()}</div>
            </div>

            <div class="animeDescription "> by ${item.getAuthor()}<p><br>
                ${item.getText()}
            </div>
        </div>
    </#list>
</#if>
</body>
</html>