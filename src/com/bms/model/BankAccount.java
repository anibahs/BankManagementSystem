/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.consumerbank.BankStatements;
import com.bms.model.util.Customer;
import com.bms.model.util.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class BankAccount {
    static private int id;
    private int accountId;
    private String accountType;
    private String routingNumber;
    private Customer customer;
    private int currentBalance;
    private BankStatements statement;


    public BankAccount(){
        id = id+1;
        this.accountId = id;
    }

    public BankAccount(String account_id){
        this.accountId = Integer.parseInt(account_id);
    }
    
    public BankAccount(Customer customer,String accountId, String type, String routingNumber, int currentBalance){
        id = id+1;
        this.accountId = id;
        this.customer=customer;
        this.accountType=type;
        this.routingNumber=routingNumber;
        this.currentBalance=currentBalance;
        this.statement=new BankStatements();
    }
    
    public int getCurrentBalance() {
        return currentBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
        public static int getId() {
        return id;
    }

    public static void setId(int id) {
        BankAccount.id = id;
    }

    public BankStatements getStatement() {
        return statement;
    }

    public void setStatement(BankStatements statement) {
        this.statement = statement;
    }

    
    @Override
    public String toString(){
        return Integer.toString(this.getAccountId());
    }

    public boolean updateAccount() {
        String query = "UPDATE bank_accounts SET current_balance = ? WHERE account_id = ?;";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(this.currentBalance);
        params.add(this.getAccountId());
        try{
            DBConnection conn = new DBConnection();
            conn.runInsert(query, params);
            return true;
        }catch(Exception c){
            c.printStackTrace();
        }
        
        return false;
    }
    
    public void updateBalancebyId(Integer no,Double total) {
        
        String query = "UPDATE bank_accounts SET current_balance = ? WHERE account_id = '"+no+"'";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(total);
        System.out.print("Parameter"+params);
        //params.add(this.getAccountId());
        try{
            DBConnection conn = new DBConnection();
            conn.runInsert(query, params);
            
        }catch(Exception c){
            c.printStackTrace();
        }
        
    }

    public Integer fetchAccount(Integer accountno) {
        
        //BankAccount bank = new BankAccount();
        int balance = 0;
        String query = "Select current_balance from bank_accounts where account_id = '"+accountno+"'";
        ArrayList<Object> params = new ArrayList<Object>();
        //params.add(customerAccountIds);
        try{
                DBConnection con = new DBConnection();
                ResultSet rs = con.runSelect(query, params); 
                balance = rs.getInt("current_balance");
                //bank.setCurrentBalance(balance);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Account Id:"+balance);
        return balance;

    }
    
}
