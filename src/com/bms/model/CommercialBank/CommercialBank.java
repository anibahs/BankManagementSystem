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
    public Loan fetchLoan(Double loanamt){
        for(Loan lo : loans){
            if(lo.getLoan() == loanamt){
                return lo;
            }
        }
        return null;
    }
    
    public Loan fetchLoanbyID(Integer id,Double amt,Double roi,Double month, Double repay, Double emi){
        
        Loan emp = new Loan();
        System.out.print("Fetching Loan"+emp);
        
        emp.setloanId(id);
        emp.setLoan(amt);
        emp.setInterestRate(roi);
        emp.setMonth(month);
        emp.setPayment(repay);
        emp.setMonthlyPayment(emi);
        
        //System.out.print("FetchEmployee Name"+emp);
        return emp;
    }
}
