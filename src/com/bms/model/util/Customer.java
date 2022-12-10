/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import com.bms.model.CommercialBank.Loan;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shabina
 */
public class Customer extends Person{
    private Person person;
    private Customer customer;
    static int id;
    private int customerId;
    private ArrayList<BankAccount> accounts;
    private ArrayList<Loan> loans;
    private HashMap<Person, BankAccount> recipients;
    //private Branch homeBranch;

    
 
    public Customer(){
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = new Person();
        this.recipients = new HashMap();
    }
    
    public Customer(String customer_id){
        this.customerId = Integer.parseInt(customer_id);
    }
    
    /**public Customer(type, String routingNumber, int currentBalance){
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = new Person();
        this.recipients = new HashMap();
    }**/
    
    public Customer(Person person){
        super();
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = person;
        this.recipients = new HashMap();
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
    

    public HashMap<Person, BankAccount> getRecipients() {
        return recipients;
    }

    public void setRecipient(HashMap<Person, BankAccount> recipients) {
        this.recipients = recipients;
    }
        
    public BankAccount addNewBankAccount(BankAccount account){
        BankAccount newAccount = new BankAccount(account.getCustomer(), account.getAccountType(), 
                account.getRoutingNumber(), account.getCurrentBalance());
        this.accounts.add(newAccount);
        return newAccount;
    }
    
    public HashMap<Person, BankAccount> addNewRecipient(Person person, BankAccount account){
        
        this.recipients.put(person, account);
        return this.recipients;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
    
}
