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
    private Person person;
    static int id;
    private int customerId;
    private ArrayList<BankAccount> accounts;
    //private Branch homeBranch;
    
    
 
    Customer(){
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = new Person();
    }
    
    public Customer(Person person){
        super();
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = person;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        
    public BankAccount addNewBankAccount(BankAccount account){
        BankAccount newAccount = new BankAccount(account.getCustomer(), account.getAccountType(), 
                account.getRoutingNumber(), account.getCurrentBalance());
        this.accounts.add(newAccount);
        return newAccount;
    }
}
