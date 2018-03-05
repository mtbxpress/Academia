
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%--<%@page  session="true"%>  --%>
<%--<%@page  import="java.util.*"%>  --%>
<%  
    if(request.getParameter("cerrarSesion")!= null){
        session.setAttribute("id_usuario",null);
        session.setAttribute("contrasena",null);
        session.setAttribute("id_rol",null);
        session.setAttribute("nombre_usuario",null);
        
    } 
    else if(session.getAttribute("id_usuario")!=null /*&& session.getAttribute("id_usuario")!=""*/) {
        response.sendRedirect("home.jsp"); 
    }
    
%>

<%--
<%= session.getAttribute("nombre_usuario")%>
<%= session.getAttribute("id_usuario")%>
<%= session.getAttribute("registro")%>
<%= session.getAttribute("recuperarPass")%>--%>

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
                            <li><a href="#pane3" data-toggle="tab">Recuperar Pass</a></li>
                        </ul>

                        <div class="tab-content">
                            <div id="pane1" class="tab-pane fade in active">
                                <!-- Register Username -->
                                <form action='d_resgister.php' method="POST">

                                </form>

                                <s:fielderror />
                                <s:form action="nuevo_usuario_alumno" id="registro-form">
                                    <h3 class="text-center">Registro de alumnos</h3>
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
                                        <label class="control-label" for="nombre">Nombre
                                      <!--  (<span id="pres-max-length">100</span> characters left)-->
                                        </label>
                                      <!--      <textarea name="presentation" id="presentation"></textarea>-->

                                        <input type="text" name="nombre" id="nombre" data-validation="length alphanumeric" data-validation-length="3-30" 
                                               data-validation-error-msg="Nombre entre (3-30 caracteres sin espacios)"
                                               placeholder="Introduzca su nombre" class="form-control">
                                    </div>
                                    <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->     
                                    <div class="form-group">
                                        <label class="control-label" for="apellido1">Primer apellido</label>
                                        <input type="text" id="apellido1" name="apellido1" data-validation="length alphanumeric" data-validation-length="3-30" 
                                               data-validation-error-msg="Primer apellido debe contener entre (3-30 caracteres)"

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
                                        <label for="email">Email</label>
                                        <input type="email" id="email" name="email" data-validation="email"  placeholder="Introduzca su Email" class="form-control">
                                        <span class="text-danger">

                                        </span>
                                    </div>	                                                        
                                    <button type="submit" class="btn btn-success">Registrar</button>
                                    <button type="reset" class="btn btn-success">Vaciar campos</button>                                
                                    <h3 id="msnRInc" class="text-center"></h3>
                                </div>
                                <input type="hidden" name="f1" value="si">
                                
                            </s:form>   
                                
                            <!--  FORMULARIO LOGIN -->

                            <div id="pane2" class="tab-pane fade">
                                <h3 class="text-center">Login de usuarios</h3>
                                <s:fielderror />
                                <s:form action="validar_usuario" id="login-form" ><!-- namespace="/plantilla" -->
                                    <div class="form-group">
                                        <label class="control-label" for="dniL">DNI</label>
                                        <input type="text" name="usuario" class="form-control" id="usuario" 
                                               data-validation="length alphanumeric" data-validation-length="8-15" 
                                               data-validation-error-msg="DNI de contener entre (8-15 caracteres)"                                           
                                               placeholder="DNI valido">                                               
                                    </div>
                                    <div class="form-group">
                                        <label for="contrasena">Password</label>
                                        <input type="password" class="form-control" name="contrasena" id="contrasena"  placeholder="Password">
                                    </div>                                
                                    <button type="submit" class="btn btn-success">Enviar</button>
                                    <!--      <button type="reset" class="btn btn-success" id="forgetBtn">Olvidé mi Password</button> -->
                                    <input type="hidden" name="f2" value="si">
                                </s:form>    
                                <h3 id="msnR" class="text-center"></h3>
                            </div>                                                       
                            <!--  FORMULARIO RECUPERAR PASSWORD -->
                            <div id="pane3" class="tab-pane fade">
                                <h3 class="text-center">Recuperar password</h3>
                                <!-- password forget -->
                                <s:fielderror />
                                <s:form action="recuperar_password" id="recuperar-form">
                                    <div class="form-group">
                                        <label for="email">Email address</label>
                                        <input type="email" id="emailRP" name="emailRP" data-validation="email"  placeholder="Introduzca su Email" class="form-control">

                                    </div>

                                    <button type="submit" class="btn btn-success">Recordad Password</button>
                                    <button type="reset" class="btn btn-success" id="loginBtn">Vaciar campo</button>
                                    <input type="hidden" name="f3" value="si">
                                </s:form>
                                    <h3 id="msnP" class="text-center"></h3>
                            </div>

                        </div>                               
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

                        </script></p>
                        <% if (request.getParameter("f1") != null && session.getAttribute("recuperarPass") != "correcto") { %>
                    <script>
                        $('#dTab li:eq(0) a').tab('show');
                        $('.tab-content div.active').removeClass('active in');
                        $('.tab-content').find('#pane1').addClass('active in');
                        $("#msnRInc").html("<div class='alert alert-danger' role='alert'>Registro incorrecto.<br>DNI o email ya estan registrados.</div>");                         
                        $("#msnP").html("");
                        $("#msnR").html("");
                    </script>
                    <% } else if (request.getParameter("f2") != null) { %>
                    <script>
                        $('#dTab li:eq(1) a').tab('show');
                        $('.tab-content div.active').removeClass('active in');
                        $('.tab-content').find('#pane2').addClass('active in');
                    </script>
                    <% } else if (request.getParameter("f3") != null) { 
                            if (session.getAttribute("recuperarPass") == "correcto") {
                                session.setAttribute("recuperarPass","") ; 
                            %>
                    <script>
                        $("#msnRInc").html("");
                        $("#msnR").html("");
                        $("#msnP").html("<div class='alert alert-info' role='alert'>Se ha enviado un correo al email indicado</div>");</script>    
                           <% }
                           else if(session.getAttribute("recuperarPass") == "incorrecto"){ %>
                    <script>
                        $("#msnR").html("");
                        $("#msnRInc").html("");
                        $("#msnP").html("<div class='alert alert-danger' role='alert'>El email no existe en nuestra base de datos</div>");</script>    

                            <% } %> 
                    <script>
                           $('#dTab li:eq(2) a').tab('show');
                           $('.tab-content div.active').removeClass('active in');
                           $('.tab-content').find('#pane3').addClass('active in');                   
                    </script>                            
                    <% } %>  
                    <% if (session.getAttribute("registro") == "correcto") {%> 
                    <script>
                        $('#dTab li:eq(1) a').tab('show');
                        $('.tab-content div.active').removeClass('active in');
                        $('.tab-content').find('#pane2').addClass('active in'); 
                        $("#msnP").html("");
                        $("#msnRInc").html("");
                        $("#msnR").html("<div class='alert alert-info' role='alert'>Registro correcto. Se ha enviado un correo con la contraseña</div>");
                    </script>
                    <% session.setAttribute("registro","") ;  }%> 


                </div>
            </div>

        </div>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/jquery.form-validator.min.js"></script>       
        <script>

                     $.validate({
                         modules: 'location, date, security, file',
                         lang: 'es',
                    //     borderColorOnError : '#000',
                    //     addValidClassOnAll : true,
                         onModulesLoaded: function () {
                             $('#country').suggestCountry();
                         }
                     });

                     // Restrict presentation length
                     $('#presentation').restrictLength($('#pres-max-length'));

        </script>                            
    </body>
</html>
