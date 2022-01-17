/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day5.optional;

import java.util.Optional;
import lombok.ToString;

/**
 *
 * @author Jayasankar
 */

@ToString
class User
{
    String name;
    String phone;
    
    public User(String name, String phone)
    {
        this.name = name;
        this.phone = phone;  
    }
    
}
public class OptionalBasicExample {
    
    
    public static void main(String args[])
    {
        Optional<User> user = Optional.of(new User("Jayasankar","9876543210"));
        
        System.out.println("Non-Empty Optional User:" + user);
        System.out.println("Non-Empty Optional  User value : " + user.get());
        System.out.println("Empty Optional: " + Optional.empty());
    }
    
}
