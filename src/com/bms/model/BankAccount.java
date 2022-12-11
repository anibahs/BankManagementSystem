/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.consumerbank.BankStatements;
import com.bms.model.util.Customer;

/**
 *
 * @author Shabina
 */
public class BankAccount {
    static private int id;
    private int accountId;
    private String accountType;
    private String routingNumber;
    private Customer customer;
    private int currentBalance;
    private BankStatements statement;


    public BankAccount(){
        id = id+1;
        this.accountId = id;
    }

    public BankAccount(String account_id){
        this.accountId = Integer.parseInt(account_id);
    }
    
    public BankAccount(Customer customer, String type, String routingNumber, int currentBalance){
        id = id+1;
        this.accountId = id;
        this.customer=customer;
        this.accountType=type;
        this.routingNumber=routingNumber;
        this.currentBalance=currentBalance;
        this.statement=new BankStatements();
    }
    
    public int getCurrentBalance() {
        return currentBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
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
    
        public static int getId() {
        return id;
    }

    public static void setId(int id) {
        BankAccount.id = id;
    }

    public BankStatements getStatement() {
        return statement;
    }

    public void setStatement(BankStatements statement) {
        this.statement = statement;
    }
    
    public boolean deposit(float amount) {
        try {
            if (amount <= 0.0F) {
                throw new IllegalArgumentException("Amount must be > 0!");
            } else {
                this.currentBalance += amount;
                return true;
            }
        } catch (IllegalArgumentException var3) {
            System.out.println(var3.getMessage());
            return false;
        }
    }
    
    public boolean withdraw(float amount) {
        try {
            if (amount <= 0.0F) {
                throw new IllegalArgumentException("Amount must be > 0!");
            } else if (amount > this.currentBalance) {
                throw new IllegalArgumentException("You cannot overdraw!");
            } else {
                this.currentBalance -= amount;
                return true;
            }
        } catch (IllegalArgumentException var3) {
            System.out.println(var3.getMessage());
            return false;
        }
    }
    
    @Override
    public String toString(){
        return Integer.toString(this.getAccountId());
    }
}
