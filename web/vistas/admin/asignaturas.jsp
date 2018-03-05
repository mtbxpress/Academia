<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    if(session.getAttribute("id_usuario")==null || session.getAttribute("id_usuario")=="") {
        response.sendRedirect("index.jsp"); 
    }
%>
<!DOCTYPE html>
<html>
    <head>
	<title>Asignaturas</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="../../plantilla/css/main.css">
    </head>

    <%@ include file="../../plantilla/sections/sidebar.jsp" %>

	<!-- Contenido -->
	<section class="full-box dashboard-contentPage">

		<!-- NavBar -->
		<nav class="full-box dashboard-Navbar">
			<ul class="full-box list-unstyled text-right">
                        <!--    <li>holaaaa</li>-->
				<li class="pull-left">
					<a href="#!" class="btn-menu-dashboard"><i class="zmdi zmdi-more-vert"></i></a>
				</li>
				<li>
					<a href="#!" class="btn-Notifications-area">
						<i class="zmdi zmdi-notifications-none"></i>
						<span class="badge">7</span>
					</a>
				</li>
				<li>
					<a href="#!" class="btn-search">
						<i class="zmdi zmdi-search"></i>
					</a>
				</li>
				<li>
					<a href="#!" class="btn-modal-help">
						<i class="zmdi zmdi-help-outline"></i>
					</a>
				</li>
			</ul>
		</nav>
		<!-- Content page -->
		<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Asignaturas <small>Admin</small></h1>
			</div>
                    <p class="lead">Desde este apartado, el administrador podr&aacute; crear nuevas asignaturas, ver todas las asignaturas disponibles en la academia y editarlas...</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#new" data-toggle="tab">Nueva</a></li>
					  	<li><a href="#list" data-toggle="tab">Listar</a></li>
					</ul>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="new">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
                                                                            <s:fielderror />
                                                                            <s:form action="nueva_asignatura" id="nueva_asignatura-form">
									    	<div class="form-group label-floating">
											  <label class="control-label">Identificador</label>
                                                                                          <input class="form-control" name="identificador" type="text">
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Nombre</label>
                                                                                          <input class="form-control" name="nombre" type="text">
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Cuatrimestre</label>
                                                                                          <input class="form-control" name="cuatrimestre" type="text">
											</div>
											<div class="form-group label-floating">
                                                                                            <label class="control-label">Descripci&oacute;n</label>
											  <input class="form-control" name="descripcion" type="text">
											</div>
										<!--	<div class="form-group label-floating">
											  <label class="control-label">Phone</label>
											  <input class="form-control" type="text">
											</div>-->
										<!--	<div class="form-group">
										      <label class="control-label">Photo</label>
										      <div>
										        <input type="text" readonly="" class="form-control" placeholder="Browse...">
										        <input type="file" >
										      </div>
										    </div
          <!-- ############################################################################################################  -->
          
          <!-- ############################################################################################################  -->
										    <p class="text-center">
										    	<button  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Guardar</button>
										    </p>
                                                                                    </s:form>
									</div>
								</div>
							</div>
						</div>
					  	<div class="tab-pane fade" id="list">
							<div class="table-responsive">
								<table class="table table-hover text-center">
									<thead>
										<tr>
											<th class="text-center">#</th>
											<th class="text-center">Identificador</th>
											<th class="text-center">Nombre</th>
											<th class="text-center">Cuatrimestre</th>
                                                                                        <th class="text-center">Descripci&oacute;n</th>
											<th class="text-center">Editar</th>
                                                                                        <th class="text-center">Eliminar</th>
										<!--	<th class="text-center">Update</th>
											<th class="text-center">Delete</th>-->
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Carlos</td>
											<td>Alfaro</td>
											<td>El Salvador</td>
											<td>carlos@gmail.com</td>
											<td><a href="#!" class="btn btn-success btn-raised btn-xs"><i class="zmdi zmdi-refresh"></i></a></td>
											<td><a href="#!" class="btn btn-danger btn-raised btn-xs"><i class="zmdi zmdi-delete"></i></a></td>
										</tr>
										<tr>
											<td>2</td>
											<td>Alicia</td>
											<td>Melendez</td>
                                                                                        <td>Melendez</td>
											<td>alicia@gmail.com</td> 
											<td><a href="#!" class="btn btn-success btn-raised btn-xs"><i class="zmdi zmdi-refresh"></i></a></td>
											<td><a href="#!" class="btn btn-danger btn-raised btn-xs"><i class="zmdi zmdi-delete"></i></a></td>
										</tr>
										<tr>
											<td>3</td>
											<td>Sarai</td>
											<td>Lopez</td>
											<td>El Salvador</td>
                                                                                        <td>El Salvador</td>
											<td><a href="#!" class="btn btn-success btn-raised btn-xs"><i class="zmdi zmdi-refresh"></i></a></td>
											<td><a href="#!" class="btn btn-danger btn-raised btn-xs"><i class="zmdi zmdi-delete"></i></a></td>
										</tr>
										<tr>
											<td>4</td>
											<td>Alba</td>
											<td>Bonilla</td>
											<td>+50312345678</td>
                                                                                        <td>El Salvador</td>
											<td><a href="#!" class="btn btn-success btn-raised btn-xs"><i class="zmdi zmdi-refresh"></i></a></td>
											<td><a href="#!" class="btn btn-danger btn-raised btn-xs"><i class="zmdi zmdi-delete"></i></a></td>
										</tr>
									</tbody>
								</table>
								<ul class="pagination pagination-sm">
								  	<li class="disabled"><a href="#!">«</a></li>
								  	<li class="active"><a href="#!">1</a></li>
								  	<li><a href="#!">2</a></li>
								  	<li><a href="#!">3</a></li>
								  	<li><a href="#!">4</a></li>
								  	<li><a href="#!">5</a></li>
								  	<li><a href="#!">»</a></li>
								</ul>
							</div>
					  	</div>
					</div>
				</div>
			</div>
		</div>
	</section> 
<%@ include file="../../plantilla/sections/notificationArea.jsp" %>
<%@ include file="../../plantilla/sections/dialogHelp.jsp" %>
<%@ include file="../../plantilla/sections/scriptAdmin.jsp" %>
<script>
    $(document).ready(function(){
        $("#icono_avatar").attr("src","plantilla/assets/img/avatar.jpg");
    });
</script>
</html>
