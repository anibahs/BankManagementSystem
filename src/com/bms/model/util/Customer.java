/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class Customer extends Person{
    static int id;
    private int customerId;
    private ArrayList<BankAccount> accounts;
    //private Branch homeBranch;


    Customer(){
        id = id+1;
        this.customerId = id;
    }
    
    public Customer(String firstName, String lastName, String gender, String address, 
            int age, String phoneNumber, String emailAddress){
        
        super(firstName, lastName, gender, address, age, phoneNumber, emailAddress);
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
    }
    
    public BankAccount addBankAccount(BankAccount bankAccount){
        BankAccount newAccount = new BankAccount();
        this.accounts.add(newAccount);
        return newAccount;
    }
    
    /**public Branch getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(Branch homeBranch) {
        this.homeBranch = homeBranch;
    }**/

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
}
