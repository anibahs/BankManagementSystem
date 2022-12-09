/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model;

import com.bms.model.consumerbank.BankStatements;
import com.bms.model.util.Customer;
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

    public BankAccount addNewBankAccount(){
        BankAccount newBankAccount = new BankAccount();
        this.bankAccountDirectory.add(newBankAccount);
        return newBankAccount;
    }
      
    public BankAccount fetchBankAccount(Customer customer, String account_id, String type, 
            String routingNumber, int currentBalance){
        BankAccount account = new BankAccount(account_id);
        account.setCustomer(customer);
        account.setAccountType(type);
        account.setRoutingNumber(routingNumber);
        account.setCurrentBalance(currentBalance);
        account.setStatement(new BankStatements());
        
        return account;
    }
}

