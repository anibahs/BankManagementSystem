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
public class UserDirectory {
    private ArrayList<User> userDirectory;

    
    public UserDirectory(){
        this.userDirectory = new ArrayList<User>();
    }
    
    public ArrayList<User> getuserDirectory() {
        return userDirectory;
    }

    public void setUser(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    public User addNewUser(Person person, String type, char[] password){
        User newUser = new User(person,type, password);
        this.userDirectory.add(newUser);
        return newUser;
    }
    
}
