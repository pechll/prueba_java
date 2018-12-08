package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core Plugin Javascript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"js/sweetalert.min.js\"></script>        \n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-dark\">\n");
      out.write("        ");

            if (request.getAttribute("stError") != null) {
        
      out.write("\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\" value=\"");
      out.print(request.getAttribute("stError").toString());
      out.write("\"/>\n");
      out.write("        <script>\n");
      out.write("            var stMensaje = document.getElementById(\"txtMensaje\").value\n");
      out.write("   //         swal(\"Mensaje\", document.getElementById(\"txtMensaje\").value,\"error\");\n");
      out.write("            swal(\"Mensaje\", stMensaje,\"error\");\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-login mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Inicio de Sesión</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"LoginController\" method=\"POST\">\n");
      out.write("                         <div class=\"form-group\">                       \n");
      out.write("                                <label for=\"lblEmail\">Correo Electrónico</label>\n");
      out.write("                                <input type=\"email\" name=\"txtEmail\" class=\"form-control\" placeholder=\"Correo Electrónico\" autofocus=\"autofocus\">\n");
      out.write("                         </div>                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                                <label for=\"lblPassword\">Contraseña</label>                                \n");
      out.write("                                <input type=\"password\" name=\"txtPassword\" class=\"form-control\" placeholder=\"Contraseña\" >                                \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" value=\"remember-me\">\n");
      out.write("                                    Recordar Contraseña\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"cmdAceptar\" type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Aceptar\">                        \n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <a class=\"d-block small mt-3\" href=\"Registrar.jsp\">Registrar Cuenta</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
