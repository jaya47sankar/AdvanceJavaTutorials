/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.mixin.working;

import java.util.List;

/**
 *
 * @author Jayasankar
 */
public interface Ship {

  
    // To be implemented in subclass
  List<String> getCargo();

  default void add(String cargo) {
    getCargo().add(cargo);
    System.out.println(cargo+" added");
  }

  default void remove(String cargo) {
    getCargo().remove(cargo);
     System.out.println(cargo+" removed");
  }
   
  default void listcargo() {
     getCargo().forEach(  
            (a)->System.out.println(a)  
        );
  }
}
