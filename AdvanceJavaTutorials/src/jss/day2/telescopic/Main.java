/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.telescopic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jayasankar
 */
public class Main {
    
    public static void main(String args[])
    {
        List<String> hobies = new ArrayList<>();
        hobies.add("cooking");
        hobies.add("reading");
        UserNormal normal1 = new UserNormal("FirstName1", "LastName1",10, "No Job",hobies);
        UserNormal normal2 = new UserNormal("FirstName2", "LastName2",10);
        UserNormal normal3 = new UserNormal("FirstName3", "LastName4");
        
        System.out.println("Normal 1 "+normal1.getName()+"  "+normal1.getProfession());
        System.out.println("Normal 2 "+normal2.getName()+"  "+normal2.getProfession());
        System.out.println("Normal 3 "+normal3.getName()+"  "+normal3.getProfession());
        
        UserTelescopic usert1 = new UserTelescopic("First Name", "LastName");
        
        System.out.println("Telescopic 1 "+usert1.getName()+"  Age : "+usert1.getAge()+"  Prof : "+usert1.getProfession());
    }
    
}
