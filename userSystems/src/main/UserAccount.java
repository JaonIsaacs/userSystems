/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lab_services_student
 */
public class UserAccount {

    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
   
    
    public UserAccount(String fn, String ln, String usn, String pwd) {
        firstname = fn;
        lastname = ln;
        username = usn;
        password = pwd;
        
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String fn) {
        firstname = fn;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String registerUser() {
        return  "Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length Username succesfuly captured Password succesfuly captured Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character." ;
    }
    
   
}


    /**
     * @return the loginUserName
     */
    
