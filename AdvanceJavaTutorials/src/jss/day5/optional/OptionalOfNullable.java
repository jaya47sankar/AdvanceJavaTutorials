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
class Contact
{
    String name;
    String phone;
    public Contact(String name, String phone)
    {
        this.name = name;
        this.phone =  phone;
    }
}
public class OptionalOfNullable {
     public static void main(String args[])
    {
        Optional<Contact> vishnu = Optional.of(new Contact("Vishnu","9876543210"));
        Contact vishnu1 = new Contact("Vishnu","9876543210");
        Contact anju = null;
        
        
        System.out.println("Value of Contact: Vishnu = " + Optional.ofNullable(vishnu.get()));
        System.out.println("Value of Contact: Vishnu1 = " + Optional.ofNullable(vishnu1));
        System.out.println("Value of Contact: Anju = " + Optional.ofNullable(anju));
        
    }
}
