/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.util.Customer;

/**
 *
 * @author Shabina
 */
public class BankAccount {
    private String accountId;
    private String routingNumber;
    private Customer customer;
    private int currentBalance;

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
