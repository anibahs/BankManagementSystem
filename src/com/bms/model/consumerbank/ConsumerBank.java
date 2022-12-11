/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbank;

import com.bms.model.util.Customer;
import com.bms.model.util.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class ConsumerBank {
    private CustomerDirectory consumerDirectory;
    private ArrayList<Customer> customerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return consumerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory consumerDirectory) {
        this.consumerDirectory = consumerDirectory;
    }

    public ConsumerBank(){
        this.consumerDirectory = new CustomerDirectory();
    }
        
    public ArrayList<Customer> addCustomerDirectory(ArrayList<Customer> customers){
        this.customerDirectory = customers;
        return this.customerDirectory;
    }   
    
}
