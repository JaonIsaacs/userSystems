/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;



/**
 *
 * @author lab_services_student
 */
public class LoginController {
 
    public static boolean checkPasswordComplexity(String x) {
        while ( x.length() >= 8){
            while (x.contains("A") ||x.contains("B") ||x.contains("C") ||x.contains("D") ||x.contains("E") ||x.contains("F") ||x.contains("G") ||x.contains("H") ||x.contains("I") ||x.contains("J") ||x.contains("K") ||x.contains("L") ||x.contains("M") ||x.contains("N") ||x.contains("O") ||x.contains("P") ||x.contains("Q") ||x.contains("R") ||x.contains("S") ||x.contains("T") ||x.contains("U") ||x.contains("V") ||x.contains("W") ||x.contains("X") ||x.contains("Y") ||x.contains("Z")){
                while (x.contains("1") ||x.contains("2") ||x.contains("3") ||x.contains("4") ||x.contains("5") ||x.contains("6") ||x.contains("7") ||x.contains("8") ||x.contains("9") ||x.contains("0")){
                    while (x.contains("!")||x.contains("@") ||x.contains("#")|| x.contains("$")|| x.contains("%") ||x.contains("^") ||x.contains("&") ||x.contains("*") ||x.contains("(") ||x.contains(")") ||x.contains("_") ||x.contains("-") ||x.contains("+") ||x.contains("=") || x.contains("?") || x.contains(">") || x.contains("<") || x.contains(";") || x.contains(":")){
                        return true;
                    }
                }
                return false;
            }return false;
        }
         return false;   
    }
     public static boolean checkUserName(String x){
         while (x.length() <=5 && x.contains("_")){
             return true;
         }
         return false;
         
     }
     
     public static boolean loginUser(String y ,String x ){
      while (x.equals(y)){
             while (x.equals(y)){
             return true;}{
             return false;
     }
             }return false;
     }
      
             
     public static boolean loginUserName(String y ,String x ){
         while (x.equals(y)){
             return true;
         } return false;
     }
     public static boolean loginUserPassword(String y ,String x ){
         while  (x.equals(y)){
             return true;
         } return false;
     }
     
}




   
    
     

