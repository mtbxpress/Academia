<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Nuevo Profesor</title>
    </head>
    <body>
        <h1>Inserte los datos del nuevo profesor</h1>
        <p><a href="<s:url action="nuevo_alumno"/>">ENLACE NUEVO PROFESOR</a></p>
        
       <p> <a href="<s:url value="template/admin.jsp" />">plantilla</a></p>
       
       <p> <a href="<s:url value="indexBootsnip.jsp" />">indexBootsnip</a></p>
       <p> <a href="<s:url value="indexBootsnipBueno.jsp" />">indexBootsnipBueno</a></p>
       <p> <a href="<s:url value="indexLoginRegistro.jsp" />">indexLoginRegistro</a></p>
       <p> <a href="<s:url value="ingreso.jsp" />">Ingreso</a></p> 
       <p> <a href="<s:url value="indexRegistroEnlace.jsp" />">indexRegistroEnlace</a></p>  
       <p> <a href="<s:url value="indexBueno.jsp" />">indexBueno</a></p> 
       <p> <a href="<s:url value="indexDobleBueno.jsp" />">indexDobleBueno</a></p> 
       
       <p> <a href="<s:url action="enviarEmail" />">Enviar email</a></p> 
       
       
       
       
       
        
        <fieldset>

            <s:form action="nuevo_alumno" id="registration-form">
                <s:textfield label="DNI profesor"        name="dni"  />   
                <s:textfield label="Nombre"              name="nombre" />
                <s:textfield label="Primer apellido"     name="apellido1" />
                <s:textfield label="Segundo apellido"    name="apellido2" />                
                <s:textfield label="Email"               name="email"     />
                <s:checkbox label="Profesor disponible"  name="matriculado" />
                <s:submit value="Enviar"/>
                <s:reset value="Restaurar"/>
            </s:form>
          </fieldset>
        <hr>
        
        
        
<form action="" id="registration-form">
                <s:textfield label="DNI profesor"        name="dni"  />   
                <s:textfield label="Nombre"              name="nombre" />
                <s:textfield label="Primer apellido"     name="apellido1" />
                <s:textfield label="Segundo apellido"    name="apellido2" />                
                <s:textfield label="Email"               name="email"           data-validation="email"/>
                <s:checkbox label="Profesor disponible"  name="matriculado" />
                <s:submit value="Enviar"/>
                <s:reset value="Restaurar"/>    
  <p>
    E-mail
    <input name="email" data-validation="email">
  </p>
  <p>
    User name
    <input name="user" data-validation="length alphanumeric" 
		 data-validation-length="3-12" 
		 data-validation-error-msg="User name has to be an alphanumeric value (3-12 chars)">
  </p>
  <p>
    Password
    <input name="pass_confirmation" data-validation="strength" 
		 data-validation-strength="2">
  </p>
  <p>
    Repeat password
    <input name="pass" data-validation="confirmation">
  </p>
  <p>
    Birth date
    <input name="birth" data-validation="birthdate" data-validation-help="yyyy-mm-dd">
  </p>
  <p>
    Country
    <input name="country" id="country" data-validation="country">
  </p>
  <p>
    Profile image
    <input name="image" type="file" data-validation="mime size required" 
		 data-validation-allowing="jpg, png" 
		 data-validation-max-size="300kb" 
		 data-validation-error-msg-required="No image selected">
  </p>
  <p>
    User Presentation (<span id="pres-max-length">100</span> characters left)
    <textarea name="presentation" id="presentation"></textarea>
  </p>
  <p>
    <input type="checkbox" data-validation="required" 
		 data-validation-error-msg="You have to agree to our terms">
    I agree to the <a href="..." target="_blank">terms of service</a>
  </p>
  <p>
    <input type="submit" value="Validate">
    <input type="reset" value="Reset form">
  </p>
</form>
  
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
