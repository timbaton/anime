<!DOCTYPE html>
<html>
 <head>
     <link rel="stylesheet" href="../../front/styles/profileStyles.css" type="text/css"/>
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		   integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <meta charset="utf-8">
 </head>
 <body> 
 	<#include "nav_bar.jsp">
	<form method="post">
		<div class="containerForProfile">
		<img src="../../front/src/profilePic.PNG" id="profilePic" class="profilePic">
		<div class="editButton-place"><a href="profile.ftl" class="buttonEdit">Done</a></div>
		</div>  
  </form>
  
  <div>
  <form method="post" class="form-container">
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