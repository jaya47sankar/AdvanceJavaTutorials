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
public class OptionalMapExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("JAYASANKAR");
        Optional<String> emptyName = Optional.empty();

        System.out.println("Non-Empty Name:: " + name.map(String::toUpperCase));
        System.out.println("Empty Name    :: " + emptyName.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOprionalName = Optional.of(Optional.of("NITHIN"));
        
        System.out.println("Optional value   :: " + nonEmptyOprionalName);
        System.out.println("Optional.map     :: " + nonEmptyOprionalName.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOprionalName.flatMap(gender -> gender.map(String::toUpperCase)));
        
    }
    
    
}
