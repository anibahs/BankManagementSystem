/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PersonDirectory(){
        this.personDirectory = new ArrayList<Person>();
    }
    
    public Person addNewPerson(String firstName, String lastName, String gender, String address, 
            int age, String phoneNumber, String emailAddress){
        Person newPerson = new Person(firstName, lastName, gender, address, 
             age, phoneNumber, emailAddress);
        this.personDirectory.add(newPerson);
        return newPerson;
    }
    
    
}
