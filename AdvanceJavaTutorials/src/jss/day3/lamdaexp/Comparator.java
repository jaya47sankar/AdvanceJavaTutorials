/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day3.lamdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jayasankar
 */
class Vehicle{  
    int id;  
    String name;  
    int wheel;  
    public Vehicle(int id, String name, int wheel) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.wheel = wheel;  
    }  
}  

public class Comparator {
      public static void main(String[] args) {  
        List<Vehicle> list=new ArrayList<>();  
          
        //Adding Products  
        list.add(new Vehicle(1,"Bus",6));  
        list.add(new Vehicle(2,"Car",4));  
        list.add(new Vehicle(3,"Bike",2)); 
         list.add(new Vehicle(3,"Airplane",20));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(v1,v2)->{  
        return v1.name.compareTo(v2.name);  
        });  
        
        
        for(Vehicle v:list){  
            System.out.println(v.id+" "+v.name+" "+v.wheel);  
        }  
  
    }  
}
