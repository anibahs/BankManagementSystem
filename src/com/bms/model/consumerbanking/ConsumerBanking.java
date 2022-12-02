/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.consumerbanking;

import com.bms.model.BankAccountDirectory;

/**
 *
 * @author Shabina
 */
public class ConsumerBanking {
    private BankAccountDirectory bankAccountDirectory;

    ConsumerBanking(){
        this.bankAccountDirectory = new BankAccountDirectory();
    }
    
    public BankAccountDirectory getBankAccountDirectory() {
        return bankAccountDirectory;
    }

    public void setBankAccountDirectory(BankAccountDirectory bankAccountDirectory) {
        this.bankAccountDirectory = bankAccountDirectory;
    }

}
