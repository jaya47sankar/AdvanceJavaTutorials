/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day3.lamdaexp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jayasankar   ()->
 */
public class LambdaForEach {
    
     public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Java");  
        list.add("Android");  
        list.add("Python");  
        list.add("Angular JS");  
          
        list.forEach(  
            (a)->System.out.println(a)  
        );  
    }  
}
