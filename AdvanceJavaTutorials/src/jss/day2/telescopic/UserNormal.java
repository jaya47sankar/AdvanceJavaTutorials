/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.telescopic;

import java.util.List;

/**
 *
 * @author Jayasankar
 */
public class UserNormal {
    
    private  String name;

    private  String lastName;

    private  int age;

    private  String profession;

    private  List<String> hobbies;
    
   

    public UserNormal(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public UserNormal(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public UserNormal(String name, String lastName, int age, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    public UserNormal(String name, String lastName, int age, String profession, List<String> hobbies) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    
    
    
}
