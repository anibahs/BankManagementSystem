/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.investmentbank;

/**
 *
 * @author asawari
 */
    

public class CurrencyStock extends StockProfile{
    
    private final String from;
    private final String to;
    
    // Class constructor
    public CurrencyStock(String f, String t, double sPrice, double bPrice) {

        super(f + "-" + t, sPrice, bPrice, 0.01);
        from = f;
        to = t;
        

    }
    
    // Method to retrieve the margin
    @Override
    public double getMargin() {
        return 0.01;
    }
    
}
