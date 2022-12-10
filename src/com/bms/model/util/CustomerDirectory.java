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
    User user;
    BankAccount bankaccount;
    
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
        //this.user = new User();
        //this.bankaccount = new BankAccount();
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
    public Customer fetchCustomer(String fname, String lname,String address, String phone, Integer accountid,
            String type,Integer balance,String routingno,Integer custid){
        
        Customer emp = new Customer();
        BankAccount bank = new BankAccount();
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        System.out.print("Fetching Customer"+emp);
        
        emp.setFirstName(fname);
        emp.setLastName(lname);
        emp.setAddress(address);
        emp.setPhoneNumber(phone);
        bank.setAccountId(accountid);
        bank.setAccountType(type);
        bank.setCurrentBalance(balance);
        bank.setRoutingNumber(routingno);
        accounts.add(bank);
        emp.setCustomerId(custid);
        emp.setAccounts(accounts);
        
        
        System.out.print("FetchEmployee Name"+emp);
        return emp;
    }
}
