/*
 * A Java program to demonstrate working of
 * FlyWeight Pattern with example of
 * Inpateints and Outpatients of Hospital
 */
package jss.day1.flyweight;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Jayasankar
 */
//Patient interface
interface Patient
{
    public void labtest(String weapon);
    public void diagnose();
}
  
//in patient Class a type of patient
class InPatient implements Patient
{
   // Intrinsic Attribute  ( in which value can be modified only inside constructor_)
    private final boolean admitted;
   // Extrinsic Attribute  ( in which value can be modified within the class )
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
  

  
// Class used to get a Patient using HashMap (Returns
// an existing patient if a patient of given type exists.
// Else creates a new patient and returns it.
class PatientFactory
{
    /* HashMap stores the reference to the object
       of Inpatient or Outpatient.  */
    private static HashMap <String, Patient> hm =
                         new HashMap<String, Patient>();

    public static Patient getPatient(String type)
    {
        Patient p = null;
  
         /* If an object for IP or OP has already been
           created simply return its reference */
         
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
  
          // Once created insert it into the HashMap
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
  
    // Utility methods to get a random Patient type and
    // test
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