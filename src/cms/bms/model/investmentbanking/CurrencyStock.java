/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bms.model.investmentbanking;

/**
 *
 * @author asawari
 */
public class CurrencyStock extends StockProfile{
    
    private final String from;
    private final String to;

    public CurrencyStock(String f, String t, double sPrice, double bPrice) {
        super(f + "-" + t, sPrice, bPrice, 0.01);
        from = f;
        to = t;
        
    }
    
    public double getMargin() {
        return 0.01;
    }
    
}
