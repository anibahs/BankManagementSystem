/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bms.model.investmentbanking;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author asawari
 */
public class BuySellShare {
    
    accountProfile accProfile;
    StockProfile[][] stocks;

    public BuySellShare(accountProfile accProfile, StockProfile[][] stocksProfile) {
        accProfile = accProfile;
        stocks = stocksProfile;
    
    
        ArrayList<String> namesOfShare = new ArrayList<>();

            for (StockProfile[] stockArray : stocksProfile) {
                for (StockProfile stock : stockArray) {
                    namesOfShare.add(stock.getProfileName());
                }
            }

            String[] shareNames = new String[namesOfShare.size()];

            for (int i = 0; i < shareNames.length; i++) {
                shareNames[i] = namesOfShare.get(i);
            }
    }   
  
    public void buyStock(StockProfile profile, int quantity) {
        
            double price = profile.getBuyPrice() * quantity;

            if (price < accProfile.getBalance()) {
                StockProfile stock = new StockProfile(profile.getProfileName(),
                        profile.getSellPrice(), profile.getBuyPrice(), quantity);
                accProfile.setBalance(-price);
                accProfile.addStock(stock);

                displayNewBalance();

            } else {
                JOptionPane.showMessageDialog(null, "You Don't Have Enough Money", "ERROR",
                        JOptionPane.WARNING_MESSAGE);

            }

        }

        // Method that is called when user wants to sell a stock
        public void sellStock(StockProfile profile, int quantity, String stockName) {

            if (quantity <= profile.getQuantity()) {

                double price = profile.getSellPrice() * quantity;
                accProfile.setBalance(+price);
                if (quantity == profile.getQuantity()) {
                    accProfile.removeStock(profile);
                } else {
                    profile.setQuantity(profile.getQuantity() - quantity);
                }

                displayNewBalance();

            } else {
                JOptionPane.showMessageDialog(null, "You Do Not Own This Many Stock", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }

        }

        //Method to display new balance
        public void displayNewBalance(){
            JOptionPane.showMessageDialog(null, "Balance: " + roundTo2DP(accProfile.getBalance()),
                        "Successful Sell", JOptionPane.WARNING_MESSAGE);
        }
        
        public StockProfile searchBoughtStock(String stockName) {
        ArrayList<StockProfile> stocksBought = accProfile.getStocks();
        for (int i = 0; i < stocksBought.size(); i++) {
            if (stocksBought.get(i).getProfileName().equalsIgnoreCase(stockName)) {
                return stocksBought.get(i);
            }
        }
        return null;
        }
        
        
        // Method to search  for a stock (used when user is buying stock)
        public StockProfile searchAvailableStock(String stockName) {

            for (StockProfile[] stockArray : stocks) {
                for (StockProfile stock : stockArray) {
                    if (stock.getProfileName().equalsIgnoreCase(stockName)) {

                        return stock;
                    }
                }

            }
            return null;
        }
        
        // Rounding to 2 decimal place
    public static Double roundTo2DP(double number) {
        DecimalFormat roundFormat = new DecimalFormat(".##");
        return (Double.parseDouble(roundFormat.format(number)));
    }

    
        }
        

    