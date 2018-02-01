<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="utente" class="model.Utente" scope="request" />
<jsp:setProperty name="utente" property="name" value="un Name"/>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/account.css">
<title>Create your Account</title>
</head>
<body>
<h1>Create your Account</h1>

<section class="moduleRegistration" class="row">
	
<div class="col-md-4 col-md-offset-4" id="fm" >
	<form action="CreateAccount" method="post" >
		<div class="form-group"><label for="username">Username:</label> <input name="username" type="text" placeholder="Username" class="form-control" /> </div> 
		<div class="form-group"><label for="email">Email:</label><input name="email" type="email" placeholder="Email" class="form-control" /></div> 
		<div class="form-group"><label for="password">Password:</label> <input name="password" type="password" placeholder="Password" class="form-control" /> </div> 
		<div class="form-group"><label for="confermaPassword">Conferm password:</label>  <input name="confirmPassword" type="password" placeholder="Confirm Password" class="form-control" /> </div> 	
		<div class="form-group"><input name="create" type="submit" value="Create"  class="btn btn-success"/></div>		
	</form>

</div>
</section>
	

	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>