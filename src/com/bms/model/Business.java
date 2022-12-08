/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.consumerbanking.ConsumerBanking;
import com.bms.model.util.UserDirectory;
import com.bms.model.util.PersonDirectory;
/**
 *
 * @author Shabina
 */
public class Business {
    private ConsumerBanking consumerBank;
    private UserDirectory userDirectory;
    private PersonDirectory personDirectory;
    
    
    
    public Business(){
        this.consumerBank= new ConsumerBanking();
        this.userDirectory = new UserDirectory();
        this.personDirectory = new PersonDirectory();
    }
        
        
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }
    
    public ConsumerBanking getConsumerBank() {
        return consumerBank;
    }

    public void setConsumerBank(ConsumerBanking consumerBank) {
        this.consumerBank = consumerBank;
    }
    
    
}
