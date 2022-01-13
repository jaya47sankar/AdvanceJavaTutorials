package jss.day2.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
  
  public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
  final Set<Topping> toppings1;
  
  //////////// BUILD START HERE////////////////

  abstract static class Builder <T extends Builder<T>> {
    EnumSet<Topping> toppings2 = EnumSet.noneOf(Topping.class);
    
    public T addTopping(Topping topping){
      toppings2.add(Objects.requireNonNull(topping)); // validation for non null data to receive  ( null will not accept
      return self();
    }

    ///////// during build it is set as super class name, but when returning it will be subclass  . it is call co varient method
    abstract Pizza build();
    protected abstract T self(); //subclass returns this in an overriding method

  }

  Pizza (Builder<?> builder){
    toppings1 =  builder.toppings2.clone();
  }

}
