/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.telescopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jayasankar
 */
public class UserTelescopic {
    
    private final String name;

    private final String lastName;

    private final int age;

    private final String profession;

    private final List<String> hobbies;

    public UserTelescopic(String name, String lastName) {
        this(name, lastName, 10);
    }

    public UserTelescopic(String name, String lastName, int age) {
        this(name, lastName, age, "IT PROF");
    }

    public UserTelescopic(String name, String lastName, int age, String profession) {
        this(name, lastName, age, profession, null);
    }

        public UserTelescopic(String name, String lastName, int age, String profession, List<String> hobbies) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.profession = profession;
            this.hobbies = hobbies == null ? new ArrayList<>() : new ArrayList<>(hobbies);
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
        return Collections.unmodifiableList(hobbies);
    }
}