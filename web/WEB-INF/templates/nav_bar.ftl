<page contentType="text/html;charset=UTF-8" language="java">
    <html>
    <head>
    </head>
    <body>
    <link rel="stylesheet" href="../../front/styles/navBarStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <ul id="menu-bar">
        <li class="logo">AnimeIsLife</li>
        <#if logged>
        <li><a href="/profile">Profile</a></li>
        <li><a href="/edit">Edit profile</a></li>
        <li><a href="/mytopics">My topics</a></li>
        <li><a href="/newpost">Add topic</a></li>
        <#else>
        <li><a href="/login">Login</a></li>
        </#if>
        <li><a href="/all">Read anime</a></li>
        <#if logged>
        <li><a href="/exit">Exit</a></li>
        </#if>
    </ul>
    </body>
    </html>
</page>