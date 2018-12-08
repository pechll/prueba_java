package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Clasificador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Clasificador de Ingresos</title>\n");
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
      out.write("\n");
      out.write("      <!--  <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"/> -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Mantenedor de Clasificador de Ingresos</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"ClasificadorController\" method=\"POST\">\n");
      out.write("                        <!-- FILA-->\n");
      out.write("                        <div class=\"form-group\">                            \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"cmdGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"cmdModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"cmdCancelar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Volver\" class=\"btn btn-primary\" name=\"cmdVolver\"/>                                    \n");
      out.write("                                </div>                                \n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        <!-- OTRA FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Información de Clasificador de Ingresos</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- OTRA FILA-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- OTRA COLUMNA-->\n");
      out.write("                                <div class=\"col-md-1\" align=\"center\">\n");
      out.write("                                    <label name=\"lblAnos\">Año Fiscal</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Año\" name=\"txtAnos\" class=\"form-control\"/>                                    \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <!-- OTRA COLUMNA-->\n");
      out.write("                                <div class=\"col-md-1\" align=\"right\">\n");
      out.write("                                    <label name=\"lblIdClasificador\">Cod.Autogenerado.</label>\n");
      out.write("                                    <input type=\"number\" placehorlder=\"(Autogenerado)\" name=\"txtIdClasificador\" class=\"form-control\" readonly=\"false\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- OTRA FILA-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- columna-->\n");
      out.write("                                <div class=\"col-md-1\">\n");
      out.write("                                    <label name=\"lblIdtributo\">Cod.Inform.</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Cód.Informático\" name=\"txtIdtributo\" class=\"form-control\" required=\"true\" />\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblConcepto\">Concepto</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Digite Concepto\" name=\"txtConcepto\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <label name=\"lblConceCorto\">Concepto Abreviado</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Digite Concepto Corto\" name=\"txtConceCorto\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- OTRA FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- OTRA COLUMNA -->\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblIdPresupuestal\">Cod.Presupuestal</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Ing.Cod.Presupuestal\" name=\"txtIdPresupuestal\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblIdFinanciero\">Cod.Financiero</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Ing.Cod.Financiero\" name=\"IdFinanciero\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblImporte\">Importe</label>\n");
      out.write("                                    <input type=\"number\" step=\"0.01\" placeholder=\"Digite Importe\" name=\"txtImporte\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblTasa\">Tasa</label>\n");
      out.write("                                    <input type=\"number\" step=\"0.01\" placeholder=\"Digite Tasa\" name=\"txtTasa\" class=\"form-control\" required=\"true\"/>\n");
      out.write("                                </div>                                                                               \n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblCodEp\">Cod.Ep</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Digite Cod.Ep\" name=\"txtCodEp\" class=\"form-control\" />\n");
      out.write("                                </div>                                                                                                \n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblTipo\" >Tipo</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlTipo\" required=\"true\">\n");
      out.write("                                        <option value=\"\">Ninguno</option>\n");
      out.write("                                        <option value=\"TR\">Tributario</option>\n");
      out.write("                                        <option value=\"NT\">No Tributario</option>\n");
      out.write("                                    </select> \n");
      out.write("                                </div>                                        \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <!-- OTRA FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- OTRA COLUMNA -->\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblSubTipo\" >Sub Tipo</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlSubTipo\">\n");
      out.write("                                        <option value=\"0\">Ninguno</option>\n");
      out.write("                                        <option value=\"1\">Impuesto</option>\n");
      out.write("                                        <option value=\"2\">Arbitrio</option>\n");
      out.write("                                        <option value=\"3\">Tasa</option>\n");
      out.write("                                        <option value=\"4\">Multa Tributaria</option>\n");
      out.write("                                        <option value=\"9999\">Otros</option>                                        \n");
      out.write("                                    </select> \n");
      out.write("                                </div>                                                            \n");
      out.write("                                <!-- OTRA COLUMNA -->\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <label name=\"lblFecha\">Fecha de Registro</label>\n");
      out.write("                                    <input type=\"date\" name=\"dFecha\" class=\"form-control\" value=\"01/11/2018\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- OTRA COLUMNA -->\n");
      out.write("                                <div class=\"col-md-2\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <label name=\"lblUsuario\">Usuario</label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Usuario\" name=\"txtUsuario\" class=\"form-control\" readonly=\"false\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- OTRA COLUMNA -->\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"lblEstado\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkEstado\" checked=\"true\"/>\n");
      out.write("                                       Estado\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>    \n");
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
