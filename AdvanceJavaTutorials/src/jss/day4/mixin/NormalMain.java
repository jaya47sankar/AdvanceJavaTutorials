/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.mixin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jayasankar
 */

interface Ship {
  void addCargo(String cargo);
  void removeCargo(String cargo);
}

interface Airport {
  void land(String plane);
  void depart(String plane);
}

class AircraftCarrier implements Ship, Airport {

  List<String> planeList = new ArrayList<>();
  List<String> cargoesList = new ArrayList<>();

  public void land(String a) {
    planeList.add(a);
    System.out.println(planeList.get(0)+" Landed");
  }

  public void depart(String a) {
    planeList.remove(a);
  }

  public void addCargo(String  c){
    cargoesList.add(c);
    System.out.println(cargoesList.get(0)+" Stored");
  }

  public void removeCargo(String c){
    cargoesList.remove(c);
  }
}

public class NormalMain {
    
    public static void main(String args[])
    {
     AircraftCarrier carrier = new AircraftCarrier();
     carrier.addCargo("Food");
     carrier.land("Helicoptor");
   
    }
    
}
