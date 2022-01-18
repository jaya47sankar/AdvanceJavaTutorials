/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day5.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Jayasankar
 */
@ToString
@Getter
@Setter        
class Phone
{
 String model;
 String company;

    public Phone(String model, String company) {
        this.model = model;
        this.company = company;
    }
 
}
public class OptionalFilterExample {
    

    public static void main(String args[]) throws Exception
    {
     Phone samsung1 = new Phone("Galaxy Note 21", "Samsung");
     Phone samsung2 = new Phone("Galaxy S 21", "Samsung");
     Phone samsung3 = new Phone("Galaxy z fold", "Samsung");
     Phone apple1 = new Phone("Iphone 13", "Apple");
     Phone apple2 = new Phone("Iphone 13 pro", "Apple");
     Phone apple3 = new Phone("Galaxy 13 pro Max", "Apple");

     List<Phone> phoneList = new ArrayList<>();
     phoneList.add(apple1);
     phoneList.add(samsung1);
     phoneList.add(apple2);
     phoneList.add(samsung2);
     phoneList.add(apple3);
     phoneList.add(samsung3);
    

        Stream<Phone> streamlist = phoneList.stream().filter(p -> (p.company.equalsIgnoreCase("Nokia"))&&(p.model.startsWith("Galaxy")));
        List<Phone> filteredlist = streamlist.collect(Collectors.toList());

         System.out.println("Phone List : " + phoneList);
         System.out.println("Phone List Filtered: " + filteredlist);
         
         Optional<Optional<Phone>> oplist = Optional.of(Optional.of(filteredlist.get(0)));
         Optional<Phone> plist = oplist.orElseThrow(Exception::new);
         
          System.out.println("Phone List final: " + plist);
        


    }


}
