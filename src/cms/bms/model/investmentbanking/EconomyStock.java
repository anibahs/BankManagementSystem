/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bms.model.investmentbanking;

/**
 *
 * @author asawari
 */
public class EconomyStock extends StockProfile{
    private final String country;
    private final double margin;
    
    // Class constructor
    public EconomyStock(String c, String name, double m, double sPrice, double bPrice) {
        super(name, sPrice, bPrice, m);
        country = c;
        margin = m;
    }
    
}
