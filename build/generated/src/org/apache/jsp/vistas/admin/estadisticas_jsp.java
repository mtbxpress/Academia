package org.apache.jsp.vistas.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class estadisticas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/vistas/admin/../../plantilla/sections/notificationArea.jsp");
    _jspx_dependants.add("/vistas/admin/../../plantilla/sections/dialogHelp.jsp");
    _jspx_dependants.add("/vistas/admin/../../plantilla/sections/script.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../../plantilla/css/main.css\">        \n");
      out.write("        <title>Estad&iacute;sticas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      if (_jspx_meth_s_include_0(_jspx_page_context))
        return;
      out.write("        \n");
      out.write("\t<!-- Content page-->\n");
      out.write("\t<section class=\"full-box dashboard-contentPage\">\n");
      out.write("\t\t<!-- NavBar -->\n");
      out.write("\t\t<nav class=\"full-box dashboard-Navbar\">\n");
      out.write("\t\t\t<ul class=\"full-box list-unstyled text-right\">\n");
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
      out.write("\t\t\t  <h1 class=\"text-titles\">System <small>Tiles</small></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"full-box text-center\" style=\"padding: 30px 10px;\">\n");
      out.write("\t\t\t<article class=\"full-box tile\">\n");
      out.write("\t\t\t\t<div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("\t\t\t\t\tAdmin\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-icon text-center\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-account\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-number text-titles\">\n");
      out.write("\t\t\t\t\t<p class=\"full-box\">7</p>\n");
      out.write("\t\t\t\t\t<small>Register</small>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article class=\"full-box tile\">\n");
      out.write("\t\t\t\t<div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("\t\t\t\t\tTeacher\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-icon text-center\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-male-alt\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-number text-titles\">\n");
      out.write("\t\t\t\t\t<p class=\"full-box\">10</p>\n");
      out.write("\t\t\t\t\t<small>Register</small>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article class=\"full-box tile\">\n");
      out.write("\t\t\t\t<div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("\t\t\t\t\tStudent\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-icon text-center\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-face\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-number text-titles\">\n");
      out.write("\t\t\t\t\t<p class=\"full-box\">70</p>\n");
      out.write("\t\t\t\t\t<small>Register</small>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article class=\"full-box tile\">\n");
      out.write("\t\t\t\t<div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("\t\t\t\t\tRepresentative\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-icon text-center\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-male-female\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"full-box tile-number text-titles\">\n");
      out.write("\t\t\t\t\t<p class=\"full-box\">70</p>\n");
      out.write("\t\t\t\t\t<small>Register</small>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t  <h1 class=\"text-titles\">System <small>TimeLine</small></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<section id=\"cd-timeline\" class=\"cd-container\">\n");
      out.write("                <div class=\"cd-timeline-block\">\n");
      out.write("                    <div class=\"cd-timeline-img\">\n");
      out.write("                        <img src=\"../../plantillas/assets/img/avatar.jpg\" alt=\"user-picture\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-content\">\n");
      out.write("                        <h4 class=\"text-center text-titles\">1 - Name (Admin)</h4>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                            <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                        </p>\n");
      out.write("                        <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"cd-timeline-block\">\n");
      out.write("                    <div class=\"cd-timeline-img\">\n");
      out.write("                        <img src=\"./assets/img/avatar.jpg\" alt=\"user-picture\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-content\">\n");
      out.write("                        <h4 class=\"text-center text-titles\">2 - Name (Teacher)</h4>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                            <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                        </p>\n");
      out.write("                        <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cd-timeline-block\">\n");
      out.write("                    <div class=\"cd-timeline-img\">\n");
      out.write("                        <img src=\"./assets/img/avatar.jpg\" alt=\"user-picture\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-content\">\n");
      out.write("                        <h4 class=\"text-center text-titles\">3 - Name (Student)</h4>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                            <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                        </p>\n");
      out.write("                        <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cd-timeline-block\">\n");
      out.write("                    <div class=\"cd-timeline-img\">\n");
      out.write("                        <img src=\"./assets/img/avatar.jpg\" alt=\"user-picture\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-content\">\n");
      out.write("                        <h4 class=\"text-center text-titles\">4 - Name (Personal Ad.)</h4>\n");
      out.write("                        <p class=\"text-center\">\n");
      out.write("                            <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                            <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                        </p>\n");
      out.write("                        <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
      out.write("        \n");
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

  private boolean _jspx_meth_s_include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_include_0 = (org.apache.struts2.views.jsp.IncludeTag) _jspx_tagPool_s_include_value_nobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_include_0.setPageContext(_jspx_page_context);
    _jspx_th_s_include_0.setParent(null);
    _jspx_th_s_include_0.setValue("../../plantilla/sections/sidebar.jsp");
    int _jspx_eval_s_include_0 = _jspx_th_s_include_0.doStartTag();
    if (_jspx_th_s_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
      return true;
    }
    _jspx_tagPool_s_include_value_nobody.reuse(_jspx_th_s_include_0);
    return false;
  }
}
