/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day4.liskov.mixin.working;

/**
 *
 * @author Jayasankar
 */
public class MixinMain {
    
    public static void main(String args[])
    {
        AircraftCarrier carrier = new AircraftCarrier();
        System.out.println("------------ADDING CARGO-------------------------------------------");
        carrier.add("Oil");
        carrier.add("Food");
        carrier.add("medicine");
        System.out.println("------------LANDING PLANES-------------------------------------------");
        carrier.land("Airplane");
        carrier.land("Helicoptor");
        System.out.println("------------CARGO LIST-------------------------------------------");
        carrier.listcargo();
        System.out.println("------------PLANE LIST-------------------------------------------");
        carrier.listplanes();
        

    }
    
}
