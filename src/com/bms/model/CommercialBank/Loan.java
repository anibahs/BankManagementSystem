/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.CommercialBank;

/**
 *
 * @author ashwini
 */
    
public class Loan {
    private int loanid;
    private double loan;
    private double interestRate;
    private double month;
    private double payment;
    private double MonthlyPayment;
    private String loanDate;
    
    public Loan(){
        this.loanid = 0;
        this.loan = 0;
        this.interestRate = 0.0;
        this.month = 0;
        this.payment = 0;
        this.MonthlyPayment = 0;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getMonthlyPayment() {
        return MonthlyPayment;
    }

    public void setMonthlyPayment(double MonthlyPayment) {
        this.MonthlyPayment = MonthlyPayment;
    }
    
    
    public double CalculateMonthlyEMI(double loan, double interestRate, double month){
        payment = loan + ((loan * interestRate)/ 100);
        MonthlyPayment = (payment/month);
        return MonthlyPayment;
    }
    
    public double CalculateTotalLoanPayment(double loan, double interestRate){
        payment = loan + ((loan * interestRate)/ 100);
        return payment;
    }
    
    public String toString(){
        return String.valueOf(this.getLoan());
    }
    
    public String getloanDate() {
        return loanDate;
    }

    public void setloanDate(String loanDate) {
        this.loanDate = loanDate;
    }
    public double getloanId() {
        return loan;
    }

    public void setloanId(int loanid) {
        this.loanid = loanid;
    }
}
