/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.buildepattern;

import jss.day2.pizza.Pizza;

/**
 *
 * @author Jayasankar
 */
public class ElectricCar extends Car {
  
  public final boolean electricMotor;

  private ElectricCar(Builder builder){
    super(builder);
    electricMotor = builder.electricMotor;
  }

  public static class Builder extends Car.Builder<Builder>{
    private boolean electricMotor = false;

    public Builder electricMotor(){
       electricMotor = true;
       return this;
    }

    @Override
    public ElectricCar build(){
      return new ElectricCar(this);
    }

    @Override
    protected Builder self(){
      return this;
    } 

  }

  public String toString(){
    return "ELECTRIC CAR CONTAINS PARTS LIKE :  "+carparts +" | HAVE ELECTRIC MOTOR "+this.electricMotor;
  }

}
