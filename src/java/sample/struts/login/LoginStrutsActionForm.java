/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.struts.login;

import java.sql.SQLException;
import javax.naming.NamingException;
import javax.servlet.Registration;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import phat.registration.RegistrationDAO;

/**
 *
 * @author zone
 */
public class LoginStrutsActionForm extends org.apache.struts.action.ActionForm {
    private String username;
    private String password;
    public LoginStrutsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean checkLogin(){
        RegistrationDAO dao = new RegistrationDAO();
        try{
            boolean result = dao.checkLogin(username, password);
            return result;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(NamingException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
}
