/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbank;

import com.bms.model.BankAccount;
import com.bms.model.util.DBConnection;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class Transaction {
    private static int id;
    private int transactionId;
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private int transactionAmount;
    private Date timestamp;
    
    public Transaction(){
        id=id+1;
        this.transactionId=id;
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Transaction.id = id;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public BankAccount getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(BankAccount fromAccount) {
        this.fromAccount = fromAccount;
    }

    public BankAccount getToAccount() {
        return toAccount;
    }

    public void setToAccount(BankAccount toAccount) {
        this.toAccount = toAccount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public boolean execute() {
        try{
            this.fromAccount.setCurrentBalance(this.fromAccount.getCurrentBalance()-this.transactionAmount);
            this.toAccount.setCurrentBalance(this.toAccount.getCurrentBalance()+this.transactionAmount);
            //call function to insert data into db
            this.insertTransaction(this);
            this.fromAccount.updateAccount();
            this.toAccount.updateAccount();
            return true;
        } catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean insertTransaction(Transaction transaction){
        String query = "INSERT INTO transactions Values(default,?,?,?,?)";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(transaction.getFromAccount().getAccountId());
        params.add(transaction.getToAccount().getAccountId());
        params.add(transaction.getTransactionAmount());
        params.add(transaction.getTimestamp());
        try{
            DBConnection conn = new DBConnection();
            conn.runInsert(query, params);
            return true;
        }catch(Exception c){
            c.printStackTrace();
        }
        
        return false;
    }
}
