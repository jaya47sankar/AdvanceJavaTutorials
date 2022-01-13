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
public class LambdaAddMain {
     public static void main(String[] args) {  
         
           // Multiple parameters with out lambda
           Addition ad3 = new Addition() {
         
            public int add(int a, int b) {
               
               return a+b;
            }
        };
           int c = ad3.add(23,24);
      //     System.out.println("Sum = "+c);
           
           
           
           
           
           
          
        // Multiple parameters with lambda expression  
        Addition ad1=(a,b)->(a+b);  
       // System.out.println("Sum = "+ad1.add(80,20));  
        int d = ad1.add(20, 30);
          System.out.println("Sum = "+d);
       
        // Multiple parameters with data type in lambda expression  
        Addition ad2=(int a,int b)->(a+b);  
        System.out.println("Sum = "+ad2.add(100,200));
        
      
       
        
        
        
    }  
    
}
