/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bms.model.investmentbanking;

import java.util.ArrayList;

/**
 *
 * @author asawari
 */
public class accountProfile {
    private String accountName;
    private double balance;
    private ArrayList<StockProfile> stocksBought;

    public accountProfile(String accName, double bal) {
        accountName = accName;
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
