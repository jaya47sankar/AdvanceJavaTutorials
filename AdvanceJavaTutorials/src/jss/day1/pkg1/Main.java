/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day1.pkg1;



/**
 *
 * @author Jayasankar
 */
public class Main {
    
    public static void main(String args[])
    {
        User u = new User("Jayasankar","1234567890");
        Employee e = new Employee("Jayasankar","Programmer");
        
        System.out.println("User Name = "+u.getName());
         System.out.println("Employee Name = "+u.getName());
        
    }
    
}
