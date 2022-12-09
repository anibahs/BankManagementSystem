/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbanking;

import com.bms.model.BankAccount;
import java.sql.Date;

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
}
