/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.immutable;

/**
 *
 * @author Jayasankar
 */
public class Test1 {
    
    public static void main(String args[])
    {
        int a = 1;
        int b = 1;
        int c = 2;
        
        Integer d = new Integer(1);
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
         System.out.println("---------------------------");
           System.out.println("IF A == B : "+(a==b));
           System.out.println("IF A == C : "+(a==c));
           System.out.println("IF A == D : "+(a==d));
    }
    
}
