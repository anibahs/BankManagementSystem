/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public Person addExistingPerson(Person person){
        this.personDirectory.add(person);
        return person;
    }
    
    public Person fetchPerson(String personId){
        DBConnection con = new DBConnection();
        String query = "Select * from person where person_id = (?);";
        Person p = new Person();
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(personId);
        ResultSet rs = con.runSelect(query, params);

        try{
            while(rs.first()){
                p = p.fetchPerson(Integer.parseInt(rs.getString("person_id")),
                        rs.getString("first_name"),rs.getString("last_name"),
                        rs.getString("gender"),rs.getString("address"),
                        Integer.parseInt(rs.getString("age")),
                        rs.getString("phone_number"),rs.getString("email"));
                System.out.println("Fetched Person");
                System.out.println(p);
                return p;
            }
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.personDirectory.add(p);
        return p;
    }
}
