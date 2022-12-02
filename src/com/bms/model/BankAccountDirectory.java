/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class BankAccountDirectory {
    private ArrayList<BankAccount> bankAccountDirectory;

    public BankAccountDirectory(){
        this.bankAccountDirectory = new ArrayList<BankAccount>();
    }
    
    public ArrayList<BankAccount> getBankAccountDirectory() {
        return bankAccountDirectory;
    }

    public void setBankAccountDirectory(ArrayList<BankAccount> bankAccountDirectory) {
        this.bankAccountDirectory = bankAccountDirectory;
    }

    public BankAccount addBankAccount(){
        BankAccount newBankAccount = new BankAccount();
        this.bankAccountDirectory.add(newBankAccount);
        return newBankAccount;
    }
    
}

