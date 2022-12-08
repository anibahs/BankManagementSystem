/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;



/**
 *
 * @author Shabina
 */
public class User extends Person{
    private Person person;
    private String type;
    private char[] password;
    private String userName;

    User(){
        this.person = new Person();
    }
    
    public User(Person person, String type, char[] password){
        super();
        this.person = person;
        this.type = type;
        this.password = password;
        this.userName = (person.getFirstName()+"."+person.getLastName()).toLowerCase();
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
