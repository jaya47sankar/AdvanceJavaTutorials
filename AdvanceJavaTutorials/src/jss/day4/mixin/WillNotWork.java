/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.mixin;

import java.util.List;

/**
 *
 * @author Jayasankar
 */

class Boat {

  List<String> cargoes;

  public void addCargo(String c){
    cargoes.add(c);
  }

  public void removeCargo(String c){
    cargoes.remove(c);
  }
}

 class Airprt {

  List<String> aircrafts;

  public void land(String a) {
    aircrafts.add(a);
  }

  public void depart(String a) {
    aircrafts.remove(a);
  }
}

//class Aircraft_Carrier extends Airport, Ship
//{
//
//}


public class WillNotWork {
    
}
