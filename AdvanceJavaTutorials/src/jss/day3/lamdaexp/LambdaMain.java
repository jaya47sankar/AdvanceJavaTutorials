/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day3.lamdaexp;

/**
 *
 * @author Jayasankar
 */
public class LambdaMain {

    public static void main(String[] args) {  
        String  messagel = "Hello World With Lambda";  
        String  message = "Hello World With Out Lambda";  
  
         //without lambda  implementing functional interface
        Printer p1 = new Printer(){  
            public void print(){System.out.println("Printing "+message);}  

        };  
        p1.print();  
   
    
 ////////////////////////////////////////////////////////////   
    
    //with lambda   implementing functional interface
        Printer p =()->{  
            System.out.println("Printing "+messagel);  
        };  
        p.print();  
      
    }
}
