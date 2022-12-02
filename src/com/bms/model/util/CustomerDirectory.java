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
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;

    CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        this.customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
}
