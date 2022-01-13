/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day3.lamdaexp;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Jayasankar
 */



class Mobile{  
    int id;  
    String model;  
    String company;  
    
    public Mobile(int id,String model, String company) {  
        super();  
        this.id = id;  
        this.model = model;  
        this.company = company;  
    }  
}  

public class CollectionFilter {
    
    public static void main(String args[])
    {
    
     List<Mobile> mobilelist = new ArrayList<Mobile>();  
     
    
        mobilelist.add(new Mobile(1,"Galaxy A31","Samsung"));  
        mobilelist.add(new Mobile(2,"Iphone 13 pro Max","Apple"));  
        mobilelist.add(new Mobile(3,"Iphone 12 pro Max","Apple"));
        mobilelist.add(new Mobile(4,"Sony Xperia Mk 5","Sony"));  
        mobilelist.add(new Mobile(5,"OnePlus 9","Oneplus"));  
        
          
        // using lambda to filter data  
        Stream<Mobile> filtered_data = mobilelist.stream().filter(m -> m.company == "Apple");  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                z -> System.out.println(z.model+": "+z.company)  
        );  
    }  
}

