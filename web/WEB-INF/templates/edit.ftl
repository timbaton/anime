<!DOCTYPE html>
<html>
 <head>
     <link rel="stylesheet" href="../css/editStyles.css" type="text/css"/>
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		   integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
 </head>
  <meta charset="utf-8">
 <body> 
 	<!--<#include "nav_bar.jsp">-->
    <link rel="stylesheet" href="../css/navBarStyles.css" type="text/css"/>
    <ul id="menu-bar">
        <li class="logo">AnimeIsLife</li>
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Search</a></li>
        <li><a href="#">Favourite</a></li>
        <li><a href="#">Later</a></li>
        <li><a href="#">Read</a></li>
        <li><a href="#">Exit</a></li>
    </ul>

    <form>
		<div class="containerForProfile">
		<img src="../../web/front/src/profilePic.PNG" id="profilePic" class="profilePic">
		<div class="editButton-place"><a href="profile.html" class="buttonEdit">Done</a></div>
		</div>  
  </form>
  
  <div>
  <form class="form-container">
	<div class="form-title">Email</div>
	<input class="form-field" id= "emailEdit" type="text" name="emailEdit" required="required"/><br />
	<div class="form-title">Age</div>
	<input class="form-field" id= "ageEdit" type="text" name="ageEdit" /><br />
	<div class="form-title">Country</div>
	<input class="form-field" id= "countryEdit" type="text" name="countryEdit" /><br />
  </form>	
</div>
</body>
</html>