<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>LogIn</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="plantilla/css/main.css">
        <style>
            .panel-footer.panel-custom {
            background: #f44336;
            color: white;
        }
        </style>
</head>
<body class="cover" style="background-image: url(plantilla/assets/img/loginFont.jpg);">
	<form action="home.html" method="post" autocomplete="off" class="full-box logInForm">
		<p class="text-center text-muted"><i class="zmdi zmdi-account-circle zmdi-hc-5x"></i></p>
		<p class="text-center text-muted text-uppercase">Inicia sesión con tu cuenta</p>
		<div class="form-group label-floating">
		  <label class="control-label" for="UserEmail">E-mail</label>
		  <input class="form-control" id="UserEmail" type="email">
		  <p class="help-block">Escribe tú E-mail</p>
		</div>
		<div class="form-group label-floating">
		  <label class="control-label" for="UserPass">Contraseña</label>
		  <input class="form-control" id="UserPass" type="text">
		  <p class="help-block">Escribe tú contraseña</p>
		</div>
		<div class="form-group text-center">
			<input type="submit" value="Iniciar sesión" class="btn btn-raised btn-danger">
		</div>
					<div class="panel-footer  panel-custom">
						No estas registrado! <a href="#" onClick=""> Registrate aquí </a>
					</div>                
	</form>
	<!--====== Scripts -->
	<script src="plantilla/js/jquery-3.1.1.min.js"></script>
	<script src="plantilla/js/bootstrap.min.js"></script>
	<script src="plantilla/js/material.min.js"></script>
	<script src="plantilla/js/ripples.min.js"></script>
	<script src="plantilla/js/sweetalert2.min.js"></script>
	<script src="plantilla/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="plantilla/js/main.js"></script>
	<script>
		$.material.init();
	</script>
</body>
</html>