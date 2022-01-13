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

/******************************************************************************
 *  Functions that use pointers or references to base classes must be able to *
 *  use objects of derived classes without knowing it.                        *                                              
 * ****************************************************************************/

class Automobile
{
   public void move(String name)
   {
     System.out.println(name+" Moves on Land");
   }
}
class FlyingAutomobile extends Automobile // ref class 1
{
   @Override 
   public void move(String name)
   {
       System.out.println(name+" Fly in the Sky");
   } 
}

class WaterAutomobile extends Automobile // ref class 2
{
   @Override 
   public void move(String name)
   {
       System.out.println(name+" moves on water");
   } 
}

class Bus extends Automobile
{
    public Bus()
    {
        super.move("Bus");
    }
}
class Ship extends WaterAutomobile
{
    public Ship()
    {
        super.move("Ship");
    }
}
class Plane extends FlyingAutomobile
{
    public Plane()
    {
        super.move("Plane");
    }
}

public class LSP_Main {
    
    public static void main(String args[])
    {
    
    Bus b = new Bus();
    Ship s = new Ship();
    Plane p = new Plane();
    }
    
}
