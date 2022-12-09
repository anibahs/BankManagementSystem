/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;


import com.bms.model.CommercialBank.CommercialBank;
//import com.bms.model.consumerbanking.ConsumerBanking;
import com.bms.model.consumerbank.ConsumerBank;
import com.bms.model.util.UserDirectory;
import com.bms.model.util.PersonDirectory;
/**
 *
 * @author Shabina
 */
public class Business {
    private ConsumerBank consumerBank;
    private UserDirectory userDirectory;
    private PersonDirectory personDirectory;
    private CommercialBank commercialbank;
    
    private BankAccountDirectory accountDirectory;

    
    public Business(){
        this.consumerBank= new ConsumerBank();
        this.userDirectory = new UserDirectory();
        this.personDirectory = new PersonDirectory();
        this.commercialbank = new CommercialBank();
        this.accountDirectory = new BankAccountDirectory();
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
    
    public ConsumerBank getConsumerBank() {
        return consumerBank;
    }

    public void setConsumerBank(ConsumerBank consumerBank) {
        this.consumerBank = consumerBank;
    }

    public CommercialBank getCommercialbank() {
        return commercialbank;
    }

    public void setCommercialbank(CommercialBank commercialbank) {
        this.commercialbank = commercialbank;
    }
    
    
    public BankAccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(BankAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    
}
