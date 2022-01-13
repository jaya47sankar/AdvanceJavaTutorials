/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.buildepattern;

import jss.day2.buildepattern.Car.CarParts;
import jss.day2.buildepattern.MotorCar.Type;


/**
 *
 * @author Jayasankar
 */
public class CarMaker {
    
    public static void main(String args[])
    {
        //MotorCar mcar = = new MotorCar.Builder().addParts(CarParts.MOTOR).addParts(CarParts.BODY).build();
        
          MotorCar mcar = new MotorCar.Builder(Type.SEDAN).addParts(CarParts.MOTOR)
                                .addParts(CarParts.BODY).addParts(CarParts.STEERING).addParts(CarParts.WHEEL).electricMotor().build();
         
          System.out.println(mcar);
        
//         Car ecar = new ElectricCar.Builder().addParts(CarParts.BATTERY).addParts(CarParts.BODY).addParts(CarParts.BREAKS).addParts(CarParts.WHEEL).electricMotor().build();
//        System.out.println(ecar);
    }
    
}
