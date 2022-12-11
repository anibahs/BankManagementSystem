/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import com.bms.model.CommercialBank.Loan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    private ArrayList<Customer> recipients;
    //private Branch homeBranch;

    
 
    public Customer(){
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = new Person();
        this.recipients = new ArrayList<Customer>();
    }
    
    public Customer(String customer_id){
        this.customerId = Integer.parseInt(customer_id);
        this.accounts = new ArrayList<BankAccount>();
        this.recipients = new ArrayList<Customer>();
    }
    
    public Customer(Person person){
        super();
        id = id+1;
        this.customerId = id;
        this.accounts = new ArrayList<BankAccount>();
        this.person = person;
        this.recipients = new ArrayList<Customer>();
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

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
    

    public ArrayList<Customer> getRecipients() {
        return recipients;
    }

    public void setRecipient(ArrayList<Customer> recipients) {
        this.recipients = recipients;
    }
        
    public BankAccount addNewBankAccount(BankAccount account){
        BankAccount newAccount = new BankAccount(account.getCustomer(),
                account.getAccountId(), account.getAccountType(), 
                account.getRoutingNumber(), account.getCurrentBalance());
        this.accounts.add(newAccount);
        return newAccount;
    }
    
    public ArrayList<Customer> addNewRecipient(Customer customer){
        
        this.recipients.add(customer);
        return this.recipients;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
    
    public ArrayList<BankAccount> fetchAccounts(Customer customer){
        System.out.println("fetchAccounts");
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        DBConnection con = new DBConnection();
        String query = "Select account_id,account_type,routing_number,current_balance from bank_accounts"
                + " WHERE customer_id = (?);";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(customer.getCustomerId());
        ResultSet rs = con.runSelect( query, params);
        try{
            do{
                BankAccount account = customer.fetchBankAccount(customer, rs.getString("account_id"),
                                        rs.getString("account_type"), rs.getString("routing_number"),
                                        Integer.parseInt(rs.getString("current_balance")));
                accounts.add(account);
            }while(rs.next());
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return accounts;       
    }
    
    public ArrayList<BankAccount> fetchAccountsbyCustname(Customer customer){
        System.out.println("fetchAccounts");
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        DBConnection con = new DBConnection();
        String query = "Select account_id,account_type,routing_number,current_balance from bank_accounts as acc, "
                + "customers as cust WHERE acc.customer_id = cust.customer_id";
        System.out.println("1");

        ArrayList<Object> params = new ArrayList<Object>();
        params.add(customer.getCustomerId());
        ResultSet rs = con.runSelect( query, params);
        System.out.println("3");
        try{
            do{
                BankAccount account = customer.fetchBankAccount(customer, rs.getString("account_id"),
                                        rs.getString("account_type"), rs.getString("routing_number"),
                                        Integer.parseInt(rs.getString("current_balance")));
                accounts.add(account);
            }while(rs.next());
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        //this.getAccounts().addAll(accounts);
        return accounts;       
    }     
    public BankAccount fetchBankAccount(Customer customer, String account_id, String type, 
            String routingNumber, int currentBalance){
        BankAccount account = new BankAccount(account_id);
        account.setCustomer(customer);
        account.setAccountType(type);
        account.setRoutingNumber(routingNumber);
        account.setCurrentBalance(currentBalance);
        return account;
    }
    
        
}
