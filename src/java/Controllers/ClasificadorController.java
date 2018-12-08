/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
 */
@WebServlet(name = "ClasificadorController", urlPatterns = {"/ClasificadorController"})
public class ClasificadorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("cmdGuardar") != null) {
            cmdGuardar(request, response);
        } else if(request.getParameter("cmdModificar") != null){
            
        } else if(request.getParameter("cmdCancelar") != null){
            
        }
    }

    public void cmdGuardar(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        try {
            //Definición de Modelos
            Models.clsClasificador obclsClasificador = new Models.clsClasificador();
            
            Models.clsTipoClasi obclsTipoClasi = new Models.clsTipoClasi();
            Models.clsSubTipoClasi obclsSubTipoClasi = new Models.clsSubTipoClasi();
            
            //Asignación de Atributos o Propiedades
            if (request.getParameter("txtAnos") != null){
                obclsClasificador.setAnos(Integer.parseInt(request.getParameter("txtAnos")));
            }
            if (request.getParameter("txtIdClasificador") != null){
                obclsClasificador.setIdClasificador(Integer.parseInt(request.getParameter("txtIdClasificador")));
            }
            if (request.getParameter("txtIdTributo") != null){
                obclsClasificador.setIdTributo(Integer.parseInt(request.getParameter("txtIdTributo")));
            }
            if (request.getParameter("txtConcepto") != null){
                obclsClasificador.setConcepto(request.getParameter("txtConcepto"));
            }
            if (request.getParameter("txtConceCorto") != null) {
                obclsClasificador.setConceCorto(request.getParameter("txtConceCorto"));
            }
            if (request.getParameter("txtIdPresupuestal") != null){
                obclsClasificador.setIdPresupuestal(request.getParameter("txtPresupuestal"));
            }
            if (request.getParameter("txtIdFinanciero") != null){
                obclsClasificador.setIdFinanciero(request.getParameter("txtIdFinanciero"));
            }
            if (request.getParameter("txtImporte") != null){
                obclsClasificador.setImporte(Integer.parseInt(request.getParameter("txtImporte")));
            }
            if (request.getParameter("txtTasa") != null){
                obclsClasificador.setTasa(Integer.parseInt(request.getParameter("txtTasa")));
            }            
            if (request.getParameter("txtCodEp") != null){
                obclsClasificador.setCodEp(request.getParameter("txtCodEp"));
            }
            
            if (request.getParameter("ddlTipo") != null){
                obclsTipoClasi.setTipo(request.getParameter("ddlTipo"));
                
                String stNTipo = "";
                
                if (request.getParameter("ddlTipo").equals(" ")){
                    stNTipo = "Ninguno";
                if (request.getParameter("ddlTipo").equals("TR"))    
                    stNTipo= "Tributario";
                }
                if (request.getParameter("ddlTipo").equals("NT")){
                    stNTipo="No Tributario";
                }
                
                obclsTipoClasi.setNtipo(stNTipo);
            }
            
            if (request.getParameter("ddlSubTipo") != null){
                obclsSubTipoClasi.setSubtipo(Integer.parseInt(request.getParameter("ddlSubTipo")));
                
                String stNSubTipo = "";
                
                if (request.getParameter("ddlSubTipo").equals("0")){
                    stNSubTipo = "Ninguno";
                }
                if (request.getParameter("ddlSubTipo").equals("1")){
                    stNSubTipo = "Impuesto";
                }
                if (request.getParameter("ddlSubTipo").equals("2")){
                    stNSubTipo = "Arbitrio";
                }
                if (request.getParameter("ddlSubTipo").equals("3")){
                    stNSubTipo = "Tasa";
                }
                if (request.getParameter("ddlSubTipo").equals("4")) {
                    stNSubTipo = "Multa Tributaria";
                }
                if (request.getParameter("ddlSubTipo").equals("9999")){
                    stNSubTipo = "Otros";
                }    
                
                obclsSubTipoClasi.setNsubtipo(stNSubTipo);       
            }

            if (request.getParameter("dFecha") != null) {
            //    obclsClasificador.setFecha(oFecha get(YEAR,MONTH,DAY)):// request.getParameter("dFecha")) ;
                String sFecha = request.getParameter("dFecha"); //"01/11/2018";
                int sanio =Integer.parseInt(sFecha.substring(6,10)) ;
                int smes = Integer.parseInt(sFecha.substring(3,5));
                int sdia = Integer.parseInt(sFecha.substring(0,2)) ;
                
                Calendar oFecha = new GregorianCalendar(sanio,smes,sdia);    
                obclsClasificador.setFecha(oFecha);
            }
            if (request.getParameter("txtUsuario") != null){
                obclsClasificador.setLogin(request.getParameter("txtUsuario"));    
            }
            if (request.getParameter("chkEstado") != null){
                char chSeleccion = request.getParameter("chkEstado").equals("on") 
                        ? '1' : '0';
                obclsClasificador.setEstado(chSeleccion);    
            }                
            
            HttpSession session = request.getSession(true);
            
            //LISTA DE OBJETOS
            List<Models.clsClasificador>  lstclsClasificador = new ArrayList<Models.clsClasificador>(); 

            // VALIDAMOS PREVIA EISTENCIA DE LA VARIABLES DE SESION
            if(session.getAttribute("session_lstclsClasificador") != null) {    
                lstclsClasificador = (List<Models.clsClasificador>) 
                        session.getAttribute("session_lstclsClasificador");
            }    
            
            //Para cálculo automático del Código que identifica ese registro
            int inCodigo = lstclsClasificador.size()+1;
            obclsClasificador.setInCodigo(inCodigo);
            
            //Agregamos el objeto a la lista
            lstclsClasificador.add(obclsClasificador);
            //Creamos la variable de session
            session.setAttribute("session_lstclsCladificador", lstclsClasificador);
            
            //Definir parámetros desde el controlador
            request.setAttribute("stMensaje", "Se realizó proceso con éxito");
            request.setAttribute("stTipo", "success");
            
            //Redirecciono y envío los valores
            request.getRequestDispatcher("Clasificador.jsp").forward(request,response);
        }catch (Exception e){
            //definir parámetros desde el controlador
            request.setAttribute("stMensaje", e.getMessage());
            request.setAttribute("stTipo", "error");      
            
            //Redirecciono y envío los valores
            request.getRequestDispatcher("Clasificador.jsp").forward(request,response);
            
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
