
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>          
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
            
        <title>Login/Registro</title>


        <style>

            .cover {
                width: 400px;
                margin: auto;

            }

            .mastfoot
            {
                padding-top:0px;
                text-align:center;
                margin: auto;

            }    
        </style>
    </head>
    <body class="cover" style="background-image: url(plantilla/assets/img/loginFont.jpg);">
        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand"></h3>
                    <ul class="nav masthead-nav">
                        <!--<li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Features</a></li>
                        <li><a href="#">Contact</a></li>-->
                    </ul>
                </div>
            </div>

            <div class="inner cover">

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Bienvenido a Academia JJDELROM</h3>
                    </div>
                    <div class="panel-body">
                        <!-- tabs -->

                        <ul id="dTab" class="nav nav-tabs">
                            <li class="active"><a href="#pane1" data-toggle="tab" >Registro</a></li>
                            <li><a href="#pane2" data-toggle="tab">Login</a></li>
                            <!--<li><a href="#pane3" data-toggle="tab"></a></li>-->
                        </ul>

                        <div class="tab-content">
                            <div id="pane1" class="tab-pane fade in active">
                                <!-- Register Username -->
                                <form action='d_resgister.php' method="POST">
                                    <fieldset>
<!--
                                    <div class="form-group">
                                        <label for="id_alumno">Introduzca su DNI</label>
                                        <input type="text" name="id_alumno" class="form-control" id="id_alumno" placeholder="DNI valido">
                                    </div>  

                                        <div class="form-group">
                                            <label class="control-label" for="email">E-mail</label>
                                            <input type="text" id="email" name="email" placeholder="Introduzca un email valido" class="form-control">
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label" for="password">Password</label>
                                            <input type="password" id="password" name="password" placeholder="Password should be at least 4 characters" class="form-control">
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label"  for="password_confirm">Password (Confirm)</label>
                                            <input type="password" id="password_confirm" name="password_confirm" placeholder="Please confirm password" class="form-control">
                                        </div>
-->
                                        <!--    <div class="form-group">
                                       <select class="form-control">
                                         <option>select</option>
                                         <option>2</option>
                                         <option>3</option>
                                         <option>4</option>
                                         <option>5</option>
                                       </select>
                                       </div>-->




                                        <!-- <div class="form-group">
                                         <label for="exampleInputFile">File Upload</label>
                                         <input type="file" id="exampleInputFile">
                                         <p class="help-block">upto 500KB</p>
                                       </div>-->



                <!--                        <button class="btn btn-success">Registro</button>
                                                        -->


                                    </fieldset>
                                </form>

                            <s:fielderror />
                            <s:form action="nuevo_alumno" id="registration-form">
                                <div class="form-group">
                                    <label class="control-label" for="dni">DNI</label>
                                    <input type="text" name="dni" class="form-control" id="dni" 
                                           data-validation="length alphanumeric" data-validation-length="8-15" 
                                           data-validation-error-msg="DNI de contener entre (8-15 caracteres)"                                           
                                           placeholder="DNI valido">                                    
 
                                    <span class="text-danger">
                                    <%--  <s:fielderror fieldName="dni" /> --%> <!-- PUEDO COLOCAR LOS ERRORES DONDE QUIERA -->
                                    </span>
                                </div>	
          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->     
                                <div class="form-group">
                                   <label class="control-label" for="nombre">Nombre</label>
                                    <input type="text" id="nombre" name="nombre" data-validation="length alphanumeric" data-validation-length="3-12" 
                                            data-validation-error-msg="Nombre debe contener entre (3-50 caracteres)"
                                            placeholder="Introduzca su nombre" class="form-control">
                                </div>
          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->     
                                <div class="form-group">
                                    <label class="control-label" for="apellido1">Primer apellido</label>
                                    <input type="text" id="apellido1" name="apellido1" data-validation="length alphanumeric" data-validation-length="3-12" 
                                            data-validation-error-msg="Primer apellido debe contener entre (3-50 caracteres)"
                                           
                                           placeholder="Introduzca su primer apellido" class="form-control">
                                    <span class="text-danger">

                                    </span>
                                </div>
          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->                                         
                                <div class="form-group">
                                    <label class="control-label" for="apellido2">Segundo apellido</label>
                                    <input type="text" id="apellido2" name="apellido2" placeholder="Introduzca su segundo apellido" class="form-control">
                                    <span class="text-danger">

                                    </span>
                                </div>	
          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->               
                                <div class="form-group">
                                    <label for="email">Correo electr&oacute;nico</label>
                                    <input type="email" id="email" name="email" data-validation="email"  placeholder="Introduzca su Email" class="form-control">
                                    <span class="text-danger">

                                    </span>
                                </div>	                                                        

                                <!-- BOTONES  aceptar y reset  -->
                                <div class="btn-toolbar" role="toolbar">
                                <!--<div class="btn-group">
                                        <div class="btn pull-left">
                                        <button type="submit" class="btn btn-success">Registro</button>                                            
                                            <span class="text-danger">
                                            </span>
                                        </div>
                                        <div class="btn pull-right">
                                            <button type="reset" class="btn btn-success">Restaurar</button>
                                            <span class="text-danger">
                                            </span>
                                        </div>    
                                    </div>-->
                                           
                                </div> 
                                    <button type="submit" class="btn btn-success">Registrar</button>
                                    <button type="reset" class="btn btn-success">Vaciar campos</button>                                
                            </s:form>



                                
                            </div>

                            <div id="pane2" class="tab-pane fade">
                                <!-- login -->
                                <form role="form" action='d_login.php' method="POST">                                  
                                    <div class="form-group">
                                        <label for="dni">Introduzca su DNI</label>
                                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="DNI valido">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    <button type="submit" class="btn btn-success">Enviar</button>

                                    <button type="reset" class="btn btn-success" id="forgetBtn">Olvidé mi Password</button> 
                                </form>
                                <!-- login-ends-->

                            </div>



                            <div id="pane3" class="tab-pane fade">
                                <!-- password forget -->
                                <form role="form" action='d_restpassword.php' method="POST">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Request a password reset. Enter your email">
                                    </div>

                                    <button type="submit" class="btn btn-success">Reset Password</button>
                                    <button type="reset" class="btn btn-success" id="loginBtn">Login</button>

                                </form>

                                <!-- password forget -->
                            </div>


                        </div>


                        <!-- -->

                    </div>
                </div>
                <!-- <h1 class="cover-heading"></h1>
                 <p class="lead"> Click to Register</p>
                 <p class="lead">
                   <a href="#" class="btn btn-lg btn-default">register</a>
                 </p>-->
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p> © 
                        <script type="text/javascript">
                            var dteNow = new Date();
                            var intYear = dteNow.getFullYear();
                            var yDate = dteNow.getFullYear() - 1;
                            document.write(yDate + " - " + intYear);



                            $(document).ready(function () {


                                $("#forgetBtn").click(function () {
                                    $('#dTab li:eq(2) a').tab('show');
                                    $('.tab-content div.active').removeClass('active in');
                                    $('.tab-content').find('#pane3').addClass('active in');
                                });

                                $("#loginBtn").click(function () {
                                    $('#dTab li:eq(1) a').tab('show');
                                    $('.tab-content div.active').removeClass('active in');
                                    $('.tab-content').find('#pane2').addClass('active in');
                                });


                            });

                        </script>
                    </p>
                </div>
            </div>

        </div>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/jquery.form-validator.min.js"></script>
<script>

  $.validate({
    modules : 'location, date, security, file',
    lang : 'es',
    onModulesLoaded : function() {
      $('#country').suggestCountry();
    }
  });

  // Restrict presentation length
  $('#presentation').restrictLength( $('#pres-max-length') );

</script>                            
    </body>
</html>
