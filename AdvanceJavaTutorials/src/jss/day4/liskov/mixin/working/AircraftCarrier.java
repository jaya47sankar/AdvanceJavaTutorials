/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.liskov.mixin.working;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jayasankar
 */
public class AircraftCarrier implements Ship, Airport {

  List<String> aircrafts = new ArrayList<>();
  List<String> cargoes = new ArrayList<>();

  @Override
  public List<String> getAircrafts(){
    return aircrafts;
  }

  public List<String> getCargo(){
    return cargoes;
  }

    
}