<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../front/styles/styles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <meta charset="utf-8">
</head>
<body>
<div class="ribbon">
    <div class="ribbon-stitches-top">
    </div>
    <strong class="ribbon-content"><h1>Anime portal</h1>
    </strong>
    <div class="ribbon-stitches-bottom">
    </div>
</div>

<form>
    <div class="containerForButtons">
        <p>
        <div class="button-enter-place">
        <a class="button-enter" onclick="show('block')">Enter</a></div>
    <div class="button-register-place">
        <a href="register" class="button-register">Register</a>
    </div>
    </div>
</form>

<div onclick="show('none')" id="gray"></div>

<div id="window">
    <form class="form-containerLogin" method="post">
        <div class="form-titleLogin"><h2>Sign in</h2></div>
        <img onclick="show('none')" src="../../front/src/close.png" class="closePic">
        <div class="form-titleLogin">Login</div>
        <input class="form-fieldLogin" id="login" type="text" name="login" required="required"/><br>
        <div class="form-titleLogin">Password</div>
        <input class="form-fieldLogin" id="password" type="text" name="password" required="required"/><br>
        <div class="submit-container">
           <input type="submit">
        </div>
    </form>
</div>

<script>
    //Функция показа
    function show(state) {
        document.getElementById('window').style.display = state;
        document.getElementById('gray').style.display = state;
    }
</script>

</body>
</html>