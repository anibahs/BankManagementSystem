/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.consumerbank.BankStatements;
import com.bms.model.consumerbank.Transaction;
import com.bms.model.util.Customer;
import com.bms.model.util.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
        this.statement=new BankStatements();
    }

    public BankAccount(String account_id){
        this.accountId = Integer.parseInt(account_id);
        this.statement=new BankStatements();
    }
    
    public BankAccount(Customer customer,int accountId, String type, String routingNumber, int currentBalance){
        this.accountId = accountId;
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
    
    public boolean deposit(float amount) {
        try {
            if (amount <= 0.0F) {
                throw new IllegalArgumentException("Amount must be > 0!");
            } else {
                this.currentBalance += amount;
                return true;
            }
        } catch (IllegalArgumentException var3) {
            System.out.println(var3.getMessage());
            return false;
        }
    }
    
    public boolean withdraw(float amount) {
        try {
            if (amount <= 0.0F) {
                throw new IllegalArgumentException("Amount must be > 0!");
            } else if (amount > this.currentBalance) {
                throw new IllegalArgumentException("You cannot overdraw!");
            } else {
                this.currentBalance -= amount;
                return true;
            }
        } catch (IllegalArgumentException var3) {
            System.out.println(var3.getMessage());
            return false;
        }
    }
    
    @Override
    public String toString(){
        return Integer.toString(this.getAccountId());
    }

    public boolean updateAccountBalance() {
        String query = "UPDATE bank_accounts SET current_balance = ? WHERE account_id = ?;";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(this.currentBalance);
        params.add(this.getAccountId());
        try{
            DBConnection conn = new DBConnection();
            conn.runInsert(query, params);
            return true;
        }catch(Exception c){
            System.out.println("c.printStackTrace()");
        }
        return false;
    }    
        
    public BankAccount fetchAccount(int accountId){
        BankAccount account = new BankAccount();
        DBConnection con = new DBConnection();
        String query = "Select account_id,account_type,routing_number,current_balance from bank_accounts"
                + " WHERE account_id = (?);";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(Integer.toString(accountId));
        ResultSet rs = con.runSelect( query, params);
        try{
            do{
                account.setCustomer(customer);
                account.setAccountId(Integer.parseInt(rs.getString("account_id")));
                account.setAccountType(rs.getString("account_type"));
                account.setRoutingNumber(rs.getString("routing_number"));
                account.setCurrentBalance(Integer.parseInt(rs.getString("current_balance")));
            }while(rs.next());
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        //this.getAccounts().addAll(accounts);
        return account;       
    }
    
    
    public void fetchStatements() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        DBConnection con = new DBConnection();
        String query = "SELECT * FROM transactions WHERE from_account_id = ?;";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(this.getAccountId());
        ResultSet rs = con.runSelect( query, params);
        try{
            do{
                Transaction t = new Transaction();
                t.setTransactionId(Integer.parseInt(rs.getString("transaction_id")));
                t.setTransactionAmount(Integer.parseInt(rs.getString("transaction_amount")));
                
                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                Date parsed = format.parse(rs.getString("timestamp"));
                java.sql.Date sql = new java.sql.Date(parsed.getTime());
                t.setTimestamp(sql);
                t.setFromAccount(this.fetchAccount(Integer.parseInt(rs.getString("from_account_id"))));
                t.setToAccount(this.fetchAccount(Integer.parseInt(rs.getString("to_account_id"))));
                System.out.println("adding Transaction"+t.toString());
                this.statement.addTransaction(t);
            }while(rs.next());
        }catch(Exception c){
            System.out.println(c.getMessage());
        }
        System.out.println(this.getStatement().getTransactions());
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

    public Integer fetchAccountNumber(Integer accountno) {
        
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
