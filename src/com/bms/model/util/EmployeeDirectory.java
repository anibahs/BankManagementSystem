/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeDirectory;
    
    public EmployeeDirectory(){
        this.employeeDirectory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(ArrayList<Employee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
}
