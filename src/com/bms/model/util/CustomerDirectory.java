/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import com.bms.model.consumerbank.BankStatements;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addNewCustomer(Person person){
        Customer newCustomer = new Customer(person);
        this.customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
    
    /*public Customer fetchCustomer(Customer customer, String account_id, String type, 
            String routingNumber, int currentBalance){
        Customer customer = new Customer();
        
        return customer;
    }*/
    
}
