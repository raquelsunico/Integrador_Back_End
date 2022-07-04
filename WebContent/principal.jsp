<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	
	<nav class="navbar navbar-dark bg-dark">
		<a style="color:white" class="navbar-toggler"><span class="navbar-toggler-icon"></span>Home</a>
	
		<div class="dropdown">
			<a style="color:white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Sesion</a>
			<div class="dropdown-menu text-center">
				<a><img src="img/Botero2.jpg" height="80" width="80"></a><br>
				<a>${nombres}</a>
				<a>${email}</a>
				<div class="dropdown-divider"></div>
				<a href="Controlador?accion=Salir" class="dropdown-item"><strong>Salir</strong></a>
			</div>
		</div>
	</nav>
	<div class="container mt-4">
		<h1>Bienvenido al sistema, <strong>Usuario: ${nombres}</strong></h1>
	</div>
		
		<div class="img text-center">
		<a><img src="img/codoacodo.png" height="200" width="300"></a>
		
		<p><strong>Gracias a la comision #22025 por permitirme la oportunidad de estar en este curso enriquecedor...
		
		Gracias profesor Nicolás, eres un sol!!</strong></p>
	
	</div>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>