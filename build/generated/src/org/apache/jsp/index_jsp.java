package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_fielderror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_id_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_fielderror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_fielderror_nobody.release();
    _jspx_tagPool_s_form_id_action.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>          \n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <title>Login/Registro</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .cover {\n");
      out.write("                width: 400px;\n");
      out.write("                margin: auto;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mastfoot\n");
      out.write("            {\n");
      out.write("                padding-top:0px;\n");
      out.write("                text-align:center;\n");
      out.write("                margin: auto;\n");
      out.write("\n");
      out.write("            }    \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"cover\" style=\"background-image: url(plantilla/assets/img/loginFont.jpg);\">\n");
      out.write("        <div class=\"cover-container\">\n");
      out.write("\n");
      out.write("            <div class=\"masthead clearfix\">\n");
      out.write("                <div class=\"inner\">\n");
      out.write("                    <h3 class=\"masthead-brand\"></h3>\n");
      out.write("                    <ul class=\"nav masthead-nav\">\n");
      out.write("                        <!--<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Features</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>-->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"inner cover\">\n");
      out.write("\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Bienvenido a Academia JJDELROM</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <!-- tabs -->\n");
      out.write("\n");
      out.write("                        <ul id=\"dTab\" class=\"nav nav-tabs\">\n");
      out.write("                            <li class=\"active\"><a href=\"#pane1\" data-toggle=\"tab\" >Registro</a></li>\n");
      out.write("                            <li><a href=\"#pane2\" data-toggle=\"tab\">Login</a></li>\n");
      out.write("                            <li><a href=\"#pane3\" data-toggle=\"tab\">Recuperar Pass</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div id=\"pane1\" class=\"tab-pane fade in active\">\n");
      out.write("                                <!-- Register Username -->\n");
      out.write("                                <form action='d_resgister.php' method=\"POST\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_s_fielderror_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("                                    \n");
      out.write("<!--  FORMULARIO LOGIN -->\n");
      out.write("                         \n");
      out.write("                            <div id=\"pane2\" class=\"tab-pane fade\">\n");
      out.write("                                ");
      if (_jspx_meth_s_fielderror_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("\n");
      out.write("                            </div>                                                       \n");
      out.write("<!--  FORMULARIO RECUPERAR PASSWORD -->\n");
      out.write("                            <div id=\"pane3\" class=\"tab-pane fade\">\n");
      out.write("                                <!-- password forget -->\n");
      out.write("                                ");
      if (_jspx_meth_s_form_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- <h1 class=\"cover-heading\"></h1>\n");
      out.write("                 <p class=\"lead\"> Click to Register</p>\n");
      out.write("                 <p class=\"lead\">\n");
      out.write("                   <a href=\"#\" class=\"btn btn-lg btn-default\">register</a>\n");
      out.write("                 </p>-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mastfoot\">\n");
      out.write("                <div class=\"inner\">\n");
      out.write("                    <p> © \n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            var dteNow = new Date();\n");
      out.write("                            var intYear = dteNow.getFullYear();\n");
      out.write("                            var yDate = dteNow.getFullYear() - 1;\n");
      out.write("                            document.write(yDate + \" - \" + intYear);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("                                $(\"#forgetBtn\").click(function () {\n");
      out.write("                                    $('#dTab li:eq(2) a').tab('show');\n");
      out.write("                                    $('.tab-content div.active').removeClass('active in');\n");
      out.write("                                    $('.tab-content').find('#pane3').addClass('active in');\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                                $(\"#loginBtn\").click(function () {\n");
      out.write("                                    $('#dTab li:eq(1) a').tab('show');\n");
      out.write("                                    $('.tab-content div.active').removeClass('active in');\n");
      out.write("                                    $('.tab-content').find('#pane2').addClass('active in');\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/jquery.form-validator.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("  $.validate({\n");
      out.write("    modules : 'location, date, security, file',\n");
      out.write("    lang : 'es',\n");
      out.write("    onModulesLoaded : function() {\n");
      out.write("      $('#country').suggestCountry();\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  // Restrict presentation length\n");
      out.write("  $('#presentation').restrictLength( $('#pres-max-length') );\n");
      out.write("\n");
      out.write("</script>                            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_s_fielderror_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_0.setParent(null);
    int _jspx_eval_s_fielderror_0 = _jspx_th_s_fielderror_0.doStartTag();
    if (_jspx_th_s_fielderror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_nobody.reuse(_jspx_th_s_fielderror_0);
      return true;
    }
    _jspx_tagPool_s_fielderror_nobody.reuse(_jspx_th_s_fielderror_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("nuevo_alumno");
    _jspx_th_s_form_0.setId("registro-form");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    <h3 class=\"text-center\">Registro de alumnos</h3>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label class=\"control-label\" for=\"dni\">DNI</label>\n");
        out.write("                                    <input type=\"text\" name=\"dni\" class=\"form-control\" id=\"dni\" \n");
        out.write("                                           data-validation=\"length alphanumeric\" data-validation-length=\"8-15\" \n");
        out.write("                                           data-validation-error-msg=\"DNI de contener entre (8-15 caracteres)\"                                           \n");
        out.write("                                           placeholder=\"DNI valido\">                                    \n");
        out.write(" \n");
        out.write("                                    <span class=\"text-danger\">\n");
        out.write("                                    ");
        out.write(" <!-- PUEDO COLOCAR LOS ERRORES DONDE QUIERA -->\n");
        out.write("                                    </span>\n");
        out.write("                                </div>\t\n");
        out.write("          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->     \n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                   <label class=\"control-label\" for=\"nombre\">Nombre</label>\n");
        out.write("                                    <input type=\"text\" id=\"nombre\" name=\"nombre\" data-validation=\"length alphanumeric\" data-validation-length=\"3-12\" \n");
        out.write("                                            data-validation-error-msg=\"Nombre debe contener entre (3-50 caracteres)\"\n");
        out.write("                                            placeholder=\"Introduzca su nombre\" class=\"form-control\">\n");
        out.write("                                </div>\n");
        out.write("          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->     \n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label class=\"control-label\" for=\"apellido1\">Primer apellido</label>\n");
        out.write("                                    <input type=\"text\" id=\"apellido1\" name=\"apellido1\" data-validation=\"length alphanumeric\" data-validation-length=\"3-12\" \n");
        out.write("                                            data-validation-error-msg=\"Primer apellido debe contener entre (3-50 caracteres)\"\n");
        out.write("                                           \n");
        out.write("                                           placeholder=\"Introduzca su primer apellido\" class=\"form-control\">\n");
        out.write("                                    <span class=\"text-danger\">\n");
        out.write("\n");
        out.write("                                    </span>\n");
        out.write("                                </div>\n");
        out.write("          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->                                         \n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label class=\"control-label\" for=\"apellido2\">Segundo apellido</label>\n");
        out.write("                                    <input type=\"text\" id=\"apellido2\" name=\"apellido2\" placeholder=\"Introduzca su segundo apellido\" class=\"form-control\">\n");
        out.write("                                    <span class=\"text-danger\">\n");
        out.write("\n");
        out.write("                                    </span>\n");
        out.write("                                </div>\t\n");
        out.write("          <!-- /////////////////////////////////////////////////////////////////////////////////////////////////// -->               \n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label for=\"email\">Email</label>\n");
        out.write("                                    <input type=\"email\" id=\"email\" name=\"email\" data-validation=\"email\"  placeholder=\"Introduzca su Email\" class=\"form-control\">\n");
        out.write("                                    <span class=\"text-danger\">\n");
        out.write("\n");
        out.write("                                    </span>\n");
        out.write("                                </div>\t                                                        \n");
        out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Registrar</button>\n");
        out.write("                                    <button type=\"reset\" class=\"btn btn-success\">Vaciar campos</button>                                \n");
        out.write("           \n");
        out.write("                            </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_1 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_1.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_1.setParent(null);
    int _jspx_eval_s_fielderror_1 = _jspx_th_s_fielderror_1.doStartTag();
    if (_jspx_th_s_fielderror_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_nobody.reuse(_jspx_th_s_fielderror_1);
      return true;
    }
    _jspx_tagPool_s_fielderror_nobody.reuse(_jspx_th_s_fielderror_1);
    return false;
  }

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("validar_usuario");
    _jspx_th_s_form_1.setId("login-form");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                    <label class=\"control-label\" for=\"dniL\">DNI</label>\n");
        out.write("                                    <input type=\"text\" name=\"usuario\" class=\"form-control\" id=\"usuario\" \n");
        out.write("                                           data-validation=\"length alphanumeric\" data-validation-length=\"8-15\" \n");
        out.write("                                           data-validation-error-msg=\"DNI de contener entre (8-15 caracteres)\"                                           \n");
        out.write("                                           placeholder=\"DNI valido\">                                               \n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                        <label for=\"contrasena\">Password</label>\n");
        out.write("                                        <input type=\"password\" class=\"form-control\" id=\"contrasena\"  placeholder=\"Password\">\n");
        out.write("                                    </div>                                \n");
        out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Enviar</button>\n");
        out.write("                                    <button type=\"reset\" class=\"btn btn-success\" id=\"forgetBtn\">Olvidé mi Password</button> \n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_form_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_2 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_2.setPageContext(_jspx_page_context);
    _jspx_th_s_form_2.setParent(null);
    _jspx_th_s_form_2.setAction("nuevo_alumno");
    _jspx_th_s_form_2.setId("registro-form");
    int _jspx_eval_s_form_2 = _jspx_th_s_form_2.doStartTag();
    if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                        <label for=\"exampleInputEmail1\">Email address</label>\n");
        out.write("                                        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Request a password reset. Enter your email\">\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Reset Password</button>\n");
        out.write("                                    <button type=\"reset\" class=\"btn btn-success\" id=\"loginBtn\">Login</button>\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_form_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_2);
      return true;
    }
    _jspx_tagPool_s_form_id_action.reuse(_jspx_th_s_form_2);
    return false;
  }
}
