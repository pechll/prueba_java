package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Sistema de Caja - Administrador - Dashboard</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Page level plugin CSS-->\n");
      out.write("        <link href=\"vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("        <script src=\"vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("        <script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Demo scripts for this page-->\n");
      out.write("        <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("        <script src=\"js/demo/chart-area-demo.js\"></script>        \n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand mr-1\" href=\"index.jsp\">Sistema de Caja</a>\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-link btn-sm text-white order-1 order-sm-0\" id=\"sidebarToggle\" href=\"#\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Navbar Search -->\n");
      out.write("            <form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Buscar...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("                <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                        <span class=\"badge badge-danger\">9+</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                        <span class=\"badge badge-danger\">7</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-user-circle fa-fw\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Configuración</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Registro de Actividades</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Login.jsp\">Salir</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <ul class=\"sidebar navbar-nav\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-fw fa-address-book\"></i>\n");
      out.write("                        <span>Mantenimiento</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Personas.jsp\">Personas</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Clasificador.jsp\">Clasificador Ingresos</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Procesos</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Personas.jsp\">Transacciones Diarias</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Clasificador.jsp\">Ingresos Genéricos por Caja</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>               \n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Reportes Diversos</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Personas.jsp\">Transacciones Diarias</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Clasificador.jsp\">Ingresos Genéricos por Caja</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>    \n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Seguridad</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Personas.jsp\">Usuarios</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Clasificador.jsp\">Cambia mi Contraseña</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Clasificador.jsp\">Asignar Accesos a Sistemas</a>                        \n");
      out.write("                    </div>\n");
      out.write("                </li>                 \n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                        <span>ssss2222</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <h6 class=\"dropdown-header\">Personas:</h6>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.html\">Login</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"register.html\">Register</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"forgot-password.html\">Forgot Password</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <h6 class=\"dropdown-header\">Clasificador de :</h6>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"404.html\">404 Page</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"blank.html\">Blank Page</a>\n");
      out.write("                    </div>                                      \n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"pagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Pages</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"pagesDropdown\">\n");
      out.write("                        <h6 class=\"dropdown-header\">Login Screens:</h6>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.html\">Login</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"register.html\">Register</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"forgot-password.html\">Forgot Password</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <h6 class=\"dropdown-header\">Other Pages:</h6>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"404.html\">404 Page</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"blank.html\">Blank Page</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                <!-- Sticky Footer -->\n");
      out.write("                <footer class=\"sticky-footer\">\n");
      out.write("                    <div class=\"container my-auto\">\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\n");
      out.write("                            <span>Copyright © LZS Ingenieros 2018</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
}
