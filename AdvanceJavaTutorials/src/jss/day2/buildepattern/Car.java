/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.buildepattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Jayasankar
 */
public abstract class Car {

    public enum CarParts { WHEEL, BODY, MOTOR, BREAKS,STEERING,BATTERY}
    
  final Set<CarParts> carparts;

  abstract static class Builder <C extends Builder<C>> {
    EnumSet<CarParts> carparts = EnumSet.noneOf(CarParts.class);
    
   
    
    public C addParts(CarParts carpart){
      carparts.add(Objects.requireNonNull(carpart));
      return self();
    }
    
   

    abstract Car build();
    protected abstract C self(); //subclass returns this in an overriding method

  }

  Car (Builder<?> builder){
    carparts =  builder.carparts.clone();  // insted of repetingly creating object we clone car object
  }
    
}
