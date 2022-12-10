/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.CommercialBank;

import com.bms.model.util.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class CommercialBank {
    private int entityId;
    private String entityttype;
    private CustomerDirectory consumerDirectory;
    private ArrayList<Loan> loans;

    
    public CommercialBank(){
        this.loans = new ArrayList<Loan>();
    }
    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityttype() {
        return entityttype;
    }

    public void setEntityttype(String entityttype) {
        this.entityttype = entityttype;
    }

    public CustomerDirectory getConsumerDirectory() {
        return consumerDirectory;
    }

    public void setConsumerDirectory(CustomerDirectory consumerDirectory) {
        this.consumerDirectory = consumerDirectory;
    }

    
    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public Loan addLoan(Loan l){
        loans.add(l);
        return l;
    }
    
    
}
