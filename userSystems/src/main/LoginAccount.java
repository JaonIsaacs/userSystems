/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lab_services_student
 */
public class LoginAccount {

    private String loginUserName;
    private String loginPassword;
    
    public LoginAccount(String lun, String lp){
       loginUserName = lun;
       loginPassword =lp;
}
    /**
     * @return the loginUserName
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    /**
     * @param loginUserName the loginUserName to set
     */
    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    /**
     * @return the loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * @param loginPassword the loginPassword to set
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
   
    public String LogInUser(){
        return " Welcome Password incorrect, please try again Username incorrect, please try again";
    }
    
}
 