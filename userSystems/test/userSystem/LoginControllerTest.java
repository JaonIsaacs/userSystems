/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package userSystem;

import main.LoginController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class LoginControllerTest {

    /**
     * Test of checkPasswordComplexity method, of class LoginController.
     */
    @Test
    public void testCheckPasswordComplexitySuccess() {
        System.out.println("checkPasswordComplexity");
        String x = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = LoginController.checkPasswordComplexity(x);
        assertEquals(expResult, result);
        System.out.println("Password succesfuly captured");

    }
    
    @Test
    public void testCheckPasswordComplexityFail() {
        System.out.println("checkPasswordComplexity");
        String x = "password";
        boolean expResult = false;
        boolean result = LoginController.checkPasswordComplexity(x);
        assertEquals(expResult, result);
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");

    }
    

    /**
     * Test of checkUserName method, of class LoginController.
     */
    @Test
    public void testCheckUserNameSuccess() {
        System.out.println("checkUserName");
        String x = "kyl_1";
        boolean expResult = true;
        boolean result = LoginController.checkUserName(x);
        assertEquals(expResult, result);
        System.out.println("Username succesfuly captured");

    }

    @Test
    public void testCheckUserNameFail() {
        System.out.println("checkUserName");
        String x = "kyle!!!!!!!";
        boolean expResult = false;
        boolean result = LoginController.checkUserName(x);
        assertEquals(expResult, result);
       System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");

    }

    /**
     * Test of loginUserName method, of class LoginController.
     */
    @Test
    public void testLoginUserName() {
        System.out.println("loginUserName");
        String y = "kyle!!!!!!!";
        String x = "kyl_1";
        boolean expResult = false;
        boolean result = LoginController.loginUserName(y, x);
        assertEquals(expResult, result);
       

    }

    /**
     * Test of loginUserPassword method, of class LoginController.
     */
    @Test
    public void testLoginUserPasswordFali() {
        System.out.println("loginUserPassword");
        System.out.println("Welcome kyle it is great to see you."  );
        String y = "password!";
        String x = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = LoginController.loginUserPassword(y, x);
        assertEquals(expResult, result);
        System.out.println("password or username incorrect");
        

    }
    
    public void testLoginUserPasswordSuccesful() {
        System.out.println("loginUserPassword");
        System.out.println("Welcome kyle it is great to see you."  );
        String y = "password!";
        String x = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = LoginController.loginUserPassword(y, x);
        assertEquals(expResult, result);
        System.out.println("Loged in");
        

    }

}
