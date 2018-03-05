package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/plantilla/sections/notificationArea.jsp");
    _jspx_dependants.add("/plantilla/sections/dialogHelp.jsp");
    _jspx_dependants.add("/plantilla/sections/script.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_include_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_include_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_include_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("id_usuario")==null || session.getAttribute("id_usuario")=="") {
        response.sendRedirect("index.jsp"); 
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t<title>Home</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"plantilla/css/main.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_include_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Contenido -->\n");
      out.write("\t<section class=\"full-box dashboard-contentPage\">\n");
      out.write("\n");
      out.write("\t\t<!-- NavBar -->\n");
      out.write("\t\t<nav class=\"full-box dashboard-Navbar\">\n");
      out.write("\t\t\t<ul class=\"full-box list-unstyled text-right\">\n");
      out.write("                        <!--    <li>holaaaa</li>-->\n");
      out.write("\t\t\t\t<li class=\"pull-left\">\n");
      out.write("\t\t\t\t\t<a href=\"#!\" class=\"btn-menu-dashboard\"><i class=\"zmdi zmdi-more-vert\"></i></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#!\" class=\"btn-Notifications-area\">\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-notifications-none\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"badge\">7</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#!\" class=\"btn-search\">\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-search\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#!\" class=\"btn-modal-help\">\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-help-outline\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<!-- Content page -->\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t  <h1 class=\"text-titles\"><i class=\"zmdi zmdi-account zmdi-hc-fw\"></i> Users <small>Admin</small></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse voluptas reiciendis tempora voluptatum eius porro ipsa quae voluptates officiis sapiente sunt dolorem, velit quos a qui nobis sed, dignissimos possimus!</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs\" style=\"margin-bottom: 15px;\">\n");
      out.write("\t\t\t\t\t  \t<li class=\"active\"><a href=\"#new\" data-toggle=\"tab\">New</a></li>\n");
      out.write("\t\t\t\t\t  \t<li><a href=\"#list\" data-toggle=\"tab\">List</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"new\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12 col-md-10 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    <form action=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t    \t<div class=\"form-group label-floating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <label class=\"control-label\">Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <input class=\"form-control\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <label class=\"control-label\">Last Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <input class=\"form-control\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <label class=\"control-label\">Address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <textarea class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <label class=\"control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <input class=\"form-control\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group label-floating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <label class=\"control-label\">Phone</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <input class=\"form-control\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <label class=\"control-label\">Photo</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <input type=\"text\" readonly=\"\" class=\"form-control\" placeholder=\"Browse...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <input type=\"file\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <p class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t<button  class=\"btn btn-info btn-raised btn-sm\"><i class=\"zmdi zmdi-floppy\"></i> Save</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t    </form>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t<div class=\"tab-pane fade\" id=\"list\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-hover text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">#</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Last Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Address</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Email</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Phone</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Update</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Delete</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Carlos</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Alfaro</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>El Salvador</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>carlos@gmail.com</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>+50312345678</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-success btn-raised btn-xs\"><i class=\"zmdi zmdi-refresh\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-danger btn-raised btn-xs\"><i class=\"zmdi zmdi-delete\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Alicia</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Melendez</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>El Salvador</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>alicia@gmail.com</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>+50312345678</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-success btn-raised btn-xs\"><i class=\"zmdi zmdi-refresh\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-danger btn-raised btn-xs\"><i class=\"zmdi zmdi-delete\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Sarai</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Lopez</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>El Salvador</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>sarai@gmail.com</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>+50312345678</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-success btn-raised btn-xs\"><i class=\"zmdi zmdi-refresh\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-danger btn-raised btn-xs\"><i class=\"zmdi zmdi-delete\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>4</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Alba</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>Bonilla</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>El Salvador</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>alba@gmail.com</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>+50312345678</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-success btn-raised btn-xs\"><i class=\"zmdi zmdi-refresh\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#!\" class=\"btn btn-danger btn-raised btn-xs\"><i class=\"zmdi zmdi-delete\"></i></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"pagination pagination-sm\">\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li class=\"disabled\"><a href=\"#!\">«</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li class=\"active\"><a href=\"#!\">1</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li><a href=\"#!\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li><a href=\"#!\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li><a href=\"#!\">4</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li><a href=\"#!\">5</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<li><a href=\"#!\">»</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> \n");
      out.write("\t<!-- Notifications area -->\n");
      out.write("\t<section class=\"full-box Notifications-area\">\n");
      out.write("\t\t<div class=\"full-box Notifications-bg btn-Notifications-area\"></div>\n");
      out.write("\t\t<div class=\"full-box Notifications-body\">\n");
      out.write("\t\t\t<div class=\"Notifications-body-title text-titles text-center\">\n");
      out.write("\t\t\t\tNotifications <i class=\"zmdi zmdi-close btn-Notifications-area\"></i>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"list-group\">\n");
      out.write("\t\t\t  \t<div class=\"list-group-item\">\n");
      out.write("\t\t\t\t    <div class=\"row-action-primary\">\n");
      out.write("\t\t\t\t      \t<i class=\"zmdi zmdi-alert-triangle\"></i>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <div class=\"row-content\">\n");
      out.write("\t\t\t\t      \t<div class=\"least-content\">17m</div>\n");
      out.write("\t\t\t\t      \t<h4 class=\"list-group-item-heading\">Tile with a label</h4>\n");
      out.write("\t\t\t\t      \t<p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus.</p>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  \t<div class=\"list-group-separator\"></div>\n");
      out.write("\t\t\t  \t<div class=\"list-group-item\">\n");
      out.write("\t\t\t\t    <div class=\"row-action-primary\">\n");
      out.write("\t\t\t\t      \t<i class=\"zmdi zmdi-alert-octagon\"></i>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <div class=\"row-content\">\n");
      out.write("\t\t\t\t      \t<div class=\"least-content\">15m</div>\n");
      out.write("\t\t\t\t      \t<h4 class=\"list-group-item-heading\">Tile with a label</h4>\n");
      out.write("\t\t\t\t      \t<p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus.</p>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  \t<div class=\"list-group-separator\"></div>\n");
      out.write("\t\t\t\t<div class=\"list-group-item\">\n");
      out.write("\t\t\t\t    <div class=\"row-action-primary\">\n");
      out.write("\t\t\t\t      \t<i class=\"zmdi zmdi-help\"></i>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <div class=\"row-content\">\n");
      out.write("\t\t\t\t      \t<div class=\"least-content\">10m</div>\n");
      out.write("\t\t\t\t      \t<h4 class=\"list-group-item-heading\">Tile with a label</h4>\n");
      out.write("\t\t\t\t      \t<p class=\"list-group-item-text\">Maecenas sed diam eget risus varius blandit.</p>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  \t<div class=\"list-group-separator\"></div>\n");
      out.write("\t\t\t  \t<div class=\"list-group-item\">\n");
      out.write("\t\t\t\t    <div class=\"row-action-primary\">\n");
      out.write("\t\t\t\t      \t<i class=\"zmdi zmdi-info\"></i>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <div class=\"row-content\">\n");
      out.write("\t\t\t\t      \t<div class=\"least-content\">8m</div>\n");
      out.write("\t\t\t\t      \t<h4 class=\"list-group-item-heading\">Tile with a label</h4>\n");
      out.write("\t\t\t\t      \t<p class=\"list-group-item-text\">Maecenas sed diam eget risus varius blandit.</p>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write('\n');
      out.write("\t<!-- Dialog help -->\n");
      out.write("\t<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"Dialog-Help\">\n");
      out.write("\t  \t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t    <div class=\"modal-content\">\n");
      out.write("\t\t\t    <div class=\"modal-header\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t    \t<h4 class=\"modal-title\">Help</h4>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t    <div class=\"modal-body\">\n");
      out.write("\t\t\t        <p>\n");
      out.write("\t\t\t        \tLorem ipsum dolor sit amet, consectetur adipisicing elit. Nesciunt beatae esse velit ipsa sunt incidunt aut voluptas, nihil reiciendis maiores eaque hic vitae saepe voluptatibus. Ratione veritatis a unde autem!\n");
      out.write("\t\t\t        </p>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t      \t<div class=\"modal-footer\">\n");
      out.write("\t\t        \t<button type=\"button\" class=\"btn btn-primary btn-raised\" data-dismiss=\"modal\"><i class=\"zmdi zmdi-thumb-up\"></i> Ok</button>\n");
      out.write("\t\t      \t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t  \t</div>\n");
      out.write("\t</div>\n");
      out.write('\n');
      out.write("\t<!--====== Scripts -->\n");
      out.write("<!--\t<script src=\"./js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"./js/sweetalert2.min.js\"></script>\n");
      out.write("\t<script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"./js/material.min.js\"></script>\n");
      out.write("\t<script src=\"./js/ripples.min.js\"></script>\n");
      out.write("\t<script src=\"./js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\t<script src=\"./js/main.js\"></script>\n");
      out.write("-->\n");
      out.write("\t<script src=\"plantilla/js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/sweetalert2.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/material.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/ripples.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\t<script src=\"plantilla/js/main.js\"></script>          \n");
      out.write("\t<script>\n");
      out.write("\t\t$.material.init();\n");
      out.write("\t</script>");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent(null);
    _jspx_th_s_include_0.setValue("plantilla/sections/sidebar.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
    return false;
  }
}
