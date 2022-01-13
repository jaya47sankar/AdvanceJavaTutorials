/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.buildepattern;

import java.util.Objects;

/*
 * @author Jayasankar
 */
public class MotorCar extends Car{
  
  public final boolean electricMotor;  
  public enum Type {HATCHBACK, SEDAN, SUV}
  private final Type type;

  MotorCar(Builder builder) {
    super(builder);
    this.type = builder.type;
    electricMotor = builder.electricMotor;
  }

  public static class Builder extends Car.Builder<Builder>{
    private final Type type;
    private boolean electricMotor = false;

    public Builder electricMotor(){
       electricMotor = true;
       return this;
    }

    public Builder(Type type){
      this.type = Objects.requireNonNull(type);
    }

    @Override
    public MotorCar build(){
      return new MotorCar(this);
    }

    @Override
    protected Builder self() {
      return this;      
    }
  }

  public Car self(){
      return this;
  }

  public String toString(){
    return "MOTOR CAR CONTAINS PARTS LIKE :  "+carparts +" | TYPE OF THIS CAR IS :"+this.type+" | HAVE ELECTRIC MOTOR "+this.electricMotor;
  }
    
}
