/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day1.flyweight;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Jayasankar
 */
interface Patient
{
    public void labtest(String weapon);
    public void diagnose();
}
  

class InPatient implements Patient
{
   
    private final boolean admitted;
  
    private String test;
  
    public InPatient()
    {
        admitted =true;
    }
    public void labtest(String test)
    {
        this.test = test;
    }
    public void diagnose()
    {
 
        System.out.println("Patient is tested "+test+". The patient is admitted "+admitted);
    }
}

class OutPatient implements Patient
{
   
    private final boolean admitted;
  
    private String test;
  
    public OutPatient()
    {
        admitted =false;
    }
    public void labtest(String test)
    {
        this.test = test;
    }
    public void diagnose()
    {
 
        System.out.println("Patient is tested "+test+". The patient is admitted "+admitted);
    }
}
  

  
// Class used to get a player using HashMap (Returns
// an existing player if a player of given type exists.
// Else creates a new player and returns it.
class PatientFactory
{
    
    private static HashMap <String, Patient> hm =
                         new HashMap<String, Patient>();

    public static Patient getPatient(String type)
    {
        Patient p = null;
  
        
        if (hm.containsKey(type))
                p = hm.get(type);
        else
        {
           
            switch(type)
            {
            case "InPatient":
                System.out.println("InPatient Created");
                p = new InPatient();
                break;
            case "OutPatient":
                System.out.println("OutPatient Created");
                p = new OutPatient();
                break;
            default :
                System.out.println("Unreachable code!");
            }
  
          
            hm.put(type, p);
        }
        return p;
    }
}
  
// Driver class
public class PatientMain
{
   
    private static String[] patientList =
                    {"InPatient", "OutPatient"};
    private static String[] testList =
      {"Blood Test", "X Ray", "CT Scan", "ECG"};
  
 
    public static void main(String args[])
    {
        
        for (int i = 0; i < 10; i++)
        {
           
            //Patient p = PatientFactory.getPatient(getRandPatientType());
  
            Patient p = PatientFactory.getPatient("OutPatient");
            p.labtest(getRandTest());
  
          
            p.diagnose();
        }
    }
  
    // Utility methods to get a random player type and
    // weapon
    public static String getRandPatientType()
    {
        Random r = new Random();
  
        // Will return an integer between [0,2)
        int randInt = r.nextInt(patientList.length);
  
        // return the player stored at index 'randInt'
        return patientList[randInt];
    }
    public static String getRandTest()
    {
        Random r = new Random();
  
        // Will return an integer between [0,5)
        int randInt = r.nextInt(testList.length);
  
        // Return the weapon stored at index 'randInt'
        return testList[randInt];
    }
}