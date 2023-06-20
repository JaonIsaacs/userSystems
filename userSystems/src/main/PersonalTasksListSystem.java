/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PersonalTasksListSystem {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        
        
        String fn = JOptionPane.showInputDialog(null, "Please enter first name", "Enter data");
        String ln = JOptionPane.showInputDialog(null, "Please enter last name", "Enter data");
        String usn = JOptionPane.showInputDialog(null, "Please enter user name", "Enter data");
        String pwd = JOptionPane.showInputDialog(null, "Please enter password", "Enter data");
        UserAccount x = new UserAccount(fn, ln, usn, pwd );
        
        
        
        boolean passwordIsValid;
        passwordIsValid = LoginController.checkPasswordComplexity(x.getPassword());
        boolean userNameIsValid = LoginController.checkUserName(x.getUsername());
        
        
        
        if (userNameIsValid){
             JOptionPane.showMessageDialog(null, x.registerUser().substring(135,164));
        }else {
            JOptionPane.showMessageDialog(null,  x.registerUser().substring(0,135));
        }
        
        if (passwordIsValid) {
            JOptionPane.showMessageDialog(null, x.registerUser().substring(164, 193));
        } else {
            JOptionPane.showMessageDialog(null, x.registerUser().substring(193, 345) );
        }
        
        
        
    

        if (passwordIsValid && userNameIsValid){
        String lun= JOptionPane.showInputDialog(null, "enter username", "Enter data");
        String lp = JOptionPane.showInputDialog(null, "enter password",  "Enter data");
        LoginAccount y = new LoginAccount (lun , lp);
        boolean loginUser = LoginController.loginUserPassword(x.getPassword(), y.getLoginPassword()) && LoginController.loginUserName( x.getUsername() , y.getLoginUserName() ) ;
        boolean faliedpassword = LoginController.loginUserName( x.getUsername() , y.getLoginUserName() );
        boolean faliedUsername =  LoginController.loginUserPassword(x.getPassword(), y.getLoginPassword());
         if (loginUser){
             JOptionPane.showInputDialog(  fn +"  "+ ln + y.LogInUser().substring(0, 8) ) ;
         } else if (faliedpassword){
             JOptionPane.showInputDialog(y.LogInUser().substring(9,45));
        }  else if (faliedUsername){
                JOptionPane.showInputDialog( y.LogInUser().substring(46, 82));
                }
}
    
}
}


