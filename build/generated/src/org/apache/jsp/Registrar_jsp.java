package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Registro de Usuarios</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>        \n");
      out.write("        \n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                swal(\"Buen Trabajo\", \"Se realizó proceso con éxito!\",\"success\");\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-register mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Registrar Cuenta</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label for=\"lblIdentificacion\">Identificación</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtIdentificacion\" class=\"form-control\" placeholder=\"Ingrese identificación\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label for=\"lblApellidoPaterno\">Apellido Paterno</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtApepat\" class=\"form-control\" placeholder=\"Ingrese Apellido Paterno\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label for=\"lblApellidoMaterno\">Apellido Materno</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtApemat\" class=\"form-control\" placeholder=\"Ingrese Apellido Materno\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"lblNombres\">Nombres</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtNombres\" class=\"form-control\" placeholder=\"Ingrese nombres\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                                               \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <label for=\"lblNombres\">Dirección</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtDireccion\" class=\"form-control\" placeholder=\"Ingrese dirección\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <label for=\"lblTelefono\">Telefono</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtTelefono\" class=\"form-control\" placeholder=\"Ingrese teléfono\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label for=\"lblCorreo\">Correo</label>                                    \n");
      out.write("                                    <input type=\"text\" name=\"txtCorreo\" class=\"form-control\" placeholder=\"Ingrese Correo\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label for=\"lblPassword\">Contraseña</label>                                    \n");
      out.write("                                    <input type=\"password\" name=\"txtPassword\" class=\"form-control\" placeholder=\"Ingrese contraseña\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label for=\"lblConfirmar\">Confirmar contraseña</label>                                    \n");
      out.write("                                    <input type=\"password\" name=\"txtConfirmar\" class=\"form-control\" placeholder=\"Confirmar contraseña\" required=\"required\" autofocus=\"autofocus\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                                \n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\" name=\"cmdAceptar\" class=\"btn btn-primary btn-block\" value=\"Aceptar\"/>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <a class=\"d-block small mt-3\" href=\"Login.jsp\">Inicio de Sesión</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
}
