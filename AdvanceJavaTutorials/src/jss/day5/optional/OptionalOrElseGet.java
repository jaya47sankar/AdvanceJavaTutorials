/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day5.optional;

import java.util.Optional;

/**
 *
 * @author Jayasankar
 */
public class OptionalOrElseGet {
    
    public static void main(String args[])
    {
        String name = null;
    String displayname = Optional.ofNullable(name).orElseGet(() -> "Default Name");
    System.out.println("Nam : "+displayname);
   
    }
    
}
