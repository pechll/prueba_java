/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinesLogic;

/**
 *
 * @author Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
 */
public class clsLogin {
    public boolean validaLogin(Models.clsLogin obclsLogin){
        try {
            return obclsLogin.getStEmail().equals("pechll@hotmail.com") &&
                  obclsLogin.getStPassword().equals("123");
            
        }catch (Exception ex){
            throw ex; 
        }
    }
}
