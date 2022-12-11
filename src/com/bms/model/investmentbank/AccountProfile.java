/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.investmentbank;

import java.util.ArrayList;

/**
 *
 * @author asawari
 */

public class AccountProfile {
     private String accountName;
    private double balance;
    private ArrayList<StockProfile> stocksBought;
    
    // Class constructor
    public AccountProfile(String aName, double bal) {
        accountName = aName;
        balance = bal;
        stocksBought = new ArrayList<>();

    }

    // Method to retrieve the account name
    public String getAccountName() {
        return accountName;
    }

    // Method to set the account balance
    public void setBalance(double b) {
        balance += b;
    }

    // Method to retrieve the account balance
    public double getBalance() {
        return balance;
    }

    // Method to add a stock once bought
    public void addStock(StockProfile s) {
        stocksBought.add(s);
    }

    // Method to remove a stock once sold
    public void removeStock(StockProfile s) {
        stocksBought.remove(s);
    }

    // Method to retrieve all stocks bought
    public ArrayList<StockProfile> getStocks() {
        return stocksBought;
    }
    
}
