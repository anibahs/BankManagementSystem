/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.util.employeerole.BankTeller;
import com.bms.model.util.employeerole.LoanOfficer;
import com.bms.model.util.employeerole.RelationshipManager;
import com.bms.model.util.employeerole.WealthManager;
import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class EmployeeRoleDirectory {
    BankTeller bankteller;
    LoanOfficer loanofficer;
    WealthManager wealthmanager;
    RelationshipManager relmanager;
    
    private ArrayList<Employee> employeeroleDirectory;
    
    public EmployeeRoleDirectory(){
        this.employeeroleDirectory = new ArrayList<Employee>();
        this.employeeroleDirectory.add(bankteller);
        this.employeeroleDirectory.add(loanofficer);
        this.employeeroleDirectory.add(wealthmanager);
        this.employeeroleDirectory.add(relmanager);
    }

    public ArrayList<Employee> getEmployeeroleDirectory() {
        return employeeroleDirectory;
    }

    public void setEmployeeroleDirectory(ArrayList<Employee> employeeroleDirectory) {
        this.employeeroleDirectory = employeeroleDirectory;
    }
    
   
}
