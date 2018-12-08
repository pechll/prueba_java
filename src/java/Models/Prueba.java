/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
 */
public class Prueba {
    
    public static void  main(String args[]){
            String sFecha ="01/11/2018";
            int sanio =Integer.parseInt(sFecha.substring(6,10)) ;
            int smes = Integer.parseInt(sFecha.substring(3,5));
            int sdia = Integer.parseInt(sFecha.substring(0,2)) ;
            
            System.out.println(sdia);
             System.out.println(smes);
              System.out.println(sanio);
              
            Calendar oFecha = new GregorianCalendar(sanio,smes,sdia);//Integer.parseInt(request.getParameter("dFecha").substring(0,4)));
            /*int anio = oFecha.get(Calendar.YEAR);
            int mes = oFecha.get(Calendar.MONTH);
            int dia = oFecha.get(Calendar.DATE);
            
             int anio = oFecha.get(sanio);
            int mes = oFecha.get(smes);
            int dia = oFecha.get(sdia);
        
            System.out.println(anio);
            System.out.println(mes);
            System.out.println(dia);
*/
            System.out.println(oFecha);
    }
            
}
