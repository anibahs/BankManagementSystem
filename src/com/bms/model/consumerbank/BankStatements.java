/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbank;

import com.bms.model.BankAccount;
import com.bms.model.util.Customer;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class BankStatements {
    private ArrayList<Transaction> transactions;
    private Customer customer;
    
    
    public BankStatements(){
        this.transactions = new ArrayList<Transaction>();
    }
    
    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addTransaction(Transaction t) {
        this.transactions.add(t);
    }
    
}
