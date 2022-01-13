/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day3.consumer;

import java.util.function.Consumer;

/**
 *
 * @author Jayasankar
 */
public class AndThen {
    
    public static void main(String args[])
            
    {
        Consumer<Integer> dispnum1 = a -> System.out.println(a+"x 1 = "+a*1);
        Consumer<Integer> dispnum2 = b -> System.out.println(b+"x 2 = "+b*2);
        Consumer<Integer> dispnum3 = c -> System.out.println(c+"x 3 = "+c*3);
        
        dispnum1.andThen(dispnum2).andThen(dispnum3).accept(5);
    }
    
}
