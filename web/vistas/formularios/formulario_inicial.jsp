<%-- 
    Document   : formulario_inicial
    Created on : 01-mar-2018, 17:32:31
    Author     : jj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:fielderror />
      
        <s:form action="nuevo_profesor">
            <div class="form-group">
                <label for="dni">DNI</label>
                <s:textfield name="dni" />   
            </div>
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <s:textfield name="nombre" />   
            </div>                
            <div class="form-group">
                <label for="apellido1">Primer apellido</label>
                <s:textfield name="apellido1" />
            </div> 
            <div class="form-group">
                <label for="apellido2">Segundo apellido</label>
                <s:textfield name="apellido2" />  
            </div> 
            <div class="form-group">
                <label for="email">Email</label>
                <s:textfield name="email" />   
            </div> 
            <div class="form-group">
                <label for="matriculado">Profesor disponible</label>
                <s:checkbox name="matriculado" />  
            </div> 
            <s:submit value="Enviar"/>
            <s:reset value="Restaurar"/>
        </s:form>
    </body>
</html>

   <%--           
            <s:form action="nuevo_profesor">     
                <s:textfield label="DNI" name="dni"  />
                <s:textfield label="Nombre"              name="nombre" />
                <s:textfield label="Primer apellido"     name="apellido1" />
                <s:textfield label="Segundo apellido"    name="apellido2" />                
                <s:textfield label="Email"               name="email" />
                <s:checkbox label="Profesor disponible"  name="matriculado" />
                <s:submit value="Enviar"/>
                <s:reset value="Restaurar"/>
            </s:form>
--%>





<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Nuevo Profesor</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="resources/bootstrap/bootstrap-theme.min.css" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="resources/bootstrap/bootstrap.min.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Inserte los datos del nuevo profesor</h1>
 
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <s:fielderror />  <!-- LISTA DE ERRORES  -->
                            <s:form action="nuevo_profesor" id="registration-form">
                                <div class="form-group">
                                    <label for="dni">DNI</label>
                                    <s:textfield name="dni" data-validation="length alphanumeric" 
                                                            data-validation-length="8-15" 
		                                            data-validation-error-msg="El DNI debe contener entre 8 y 15 caracteres"/>    
                                    <span class="text-danger">
                                    <%--  <s:fielderror fieldName="dni" /> --%> <!-- PUEDO COLOCAR LOS ERRORES DONDE QUIERA -->
                                    </span>
                                </div>	
                                <div class="form-group">
                                    <label for="nombre">Nombre</label>
                                    <s:textfield name="nombre" data-validation="letternumeric" data-validation-error-msg="Debe introducir el nombre correcto."/>    
                                    <span class="text-danger">

                                    </span>
                                </div>	
                                <div class="form-group">
                                    <label for="apellido1">Primer apellido</label>
                                    <s:textfield name="apellido1" data-validation="letternumeric"/>    
                                    <span class="text-danger">

                                    </span>
                                </div>	
                                <div class="form-group">
                                    <label for="apellido2">Segundo apellido</label>
                                    <s:textfield name="apellido2" data-validation="letternumeric"/>    
                                    <span class="text-danger">

                                    </span>
                                </div>	
                                <div class="form-group">
                                    <label for="email">Correo electr&oacute;nico</label>
                                    <s:textfield name="email" data-validation="email"/>    
                                    <span class="text-danger">

                                    </span>
                                </div>	
                                <div class="form-group">
                                    <label for="matriculado">Disponible</label>
                                    <s:checkbox name="matriculado" /> 
                                    <span class="text-danger">

                                    </span>
                                </div>	                                                        

                                <!-- BOTONES  aceptar y reset  -->
                                <div class="btn-toolbar" role="toolbar">
                                    <div class="btn-group">

                                        <div class="btn pull-left">
                                            <s:submit value="Enviar"/>
                                            <span class="text-danger">

                                            </span>
                                        </div>
                                        <div class="btn pull-right">
                                            <s:reset value="Restaurar"/>
                                            <span class="text-danger">

                                            </span>
                                        </div>    
                                    </div>
                                           
                                </div> 
                            </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>           


<script type="text/javascript" src="resources/validation/jquery.min.js"></script>
<script type="text/javascript" src="resources/validation/jquery.form-validator.min.js"></script>
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