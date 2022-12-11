/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import com.bms.model.consumerbank.BankStatements;
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
    public Employee addNewEmployee(){
        Employee emp = new Employee();
        this.employeeDirectory.add(emp);
        return emp;
    }
      
    public Employee fetchEmployee(String fname, String lname,Integer age, String gender, String address, String phone,
            String email){
        
        Employee emp = new Employee();
        System.out.print("Fetching Employee"+emp);
        
        emp.setFirstName(fname);
        emp.setLastName(lname);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setAddress(address);
        emp.setPhoneNumber(phone);
        emp.setEmailAddress(email);
        
        //System.out.print("FetchEmployee Name"+emp);
        return emp;
    }
    
}
