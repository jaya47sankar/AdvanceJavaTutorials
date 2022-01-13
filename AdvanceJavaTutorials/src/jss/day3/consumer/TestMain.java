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
public class TestMain {
    
    public static void main(String args[])
    {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
 
        // Implement display using accept()
        display.accept(10);
    }
    
}
