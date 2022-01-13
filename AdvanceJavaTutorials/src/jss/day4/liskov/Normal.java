/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.liskov;

/**
 *
 * @author Jayasankar
 */
class Vehicle
{
    public void fly(String name)
    {
        System.out.println(name+" can FLY");
    }
         
}
class Airplane extends Vehicle
{

  public Airplane(){  
        super.fly("Airplane"); //To change body of generated methods, choose Tools | Templates.
    }
  
}

class Car extends Vehicle
{

  public Car(){  
        super.fly("Car"); //To change body of generated methods, choose Tools | Templates.
    }
  
}
public class Normal {
    
    public static void main(String args[])
    {
        Airplane a = new Airplane();
        Car c= new Car();
    }
    
    
    
}
