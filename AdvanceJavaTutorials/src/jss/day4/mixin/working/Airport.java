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
public interface Airport {

  
    // To be implemented in subclass
  List<String> getAircrafts();

  default void land(String aircraft) {
    getAircrafts().add(aircraft);
     System.out.println(aircraft+" Landed");
  }

  default void depart(String aircraft) {
    getAircrafts().remove(aircraft);
     System.out.println(aircraft+" departed");
  }
    
  
  default void listplanes() {
     getAircrafts().forEach(  
            (a)->System.out.println(a)  
        );
  }
}
