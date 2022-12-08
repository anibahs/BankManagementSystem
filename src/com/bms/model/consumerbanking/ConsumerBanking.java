/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbanking;

import com.bms.model.util.Customer;
import com.bms.model.util.CustomerDirectory;

/**
 *
 * @author Shabina
 */
public class ConsumerBanking {
    private CustomerDirectory consumerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return consumerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory consumerDirectory) {
        this.consumerDirectory = consumerDirectory;
    }

    public ConsumerBanking(){
        this.consumerDirectory = new CustomerDirectory();
    }
    
   
    
}
