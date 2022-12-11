/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import com.bms.model.BankAccount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    User user;
    BankAccount bankaccount;
    
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
        //this.user = new User();
        //this.bankaccount = new BankAccount();
    }
    
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addNewCustomer(Person person){
        Customer newCustomer = new Customer(person);
        this.customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
    public Customer addExistingCustomer(Customer customer){
        this.customerDirectory.add(customer);
        return customer;
    }
    
    /*
    public Customer convertCustomer(String customerId, String person_id, String account_id){
        Customer customer = new Customer();
        
        return customer;
    }*/
    public Customer fetchCustomer(String fname, String lname,String address, String phone, Integer accountid,
            String type,Integer balance,String routingno,Integer custid){
        
        Customer emp = new Customer();
        BankAccount bank = new BankAccount();
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        System.out.print("Fetching Customer"+emp);
        
        emp.setFirstName(fname);
        emp.setLastName(lname);
        emp.setAddress(address);
        emp.setPhoneNumber(phone);
        bank.setAccountId(accountid);
        bank.setAccountType(type);
        bank.setCurrentBalance(balance);
        bank.setRoutingNumber(routingno);
        accounts.add(bank);
        emp.setCustomerId(custid);
        emp.setAccounts(accounts);
        
        
        System.out.print("FetchEmployee Name"+emp);
        return emp;
    }
    
    
    public Customer fetchCustomer(String personId){
        DBConnection con = new DBConnection();
        String query = "Select * from customers where person_id = (?);";
        Customer c = new Customer();
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(personId);
        ResultSet rs = con.runSelect(query, params);

        try{
            while(rs.next()){
                c.setCustomerId(Integer.parseInt(rs.getString("customer_id")));
                System.out.println("Fetched Customer");
                System.out.println(c);
            }
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.addExistingCustomer(c);
        return c;     
    }
    
    
    public void fetchCustomers(){
        DBConnection con = new DBConnection();
        String query = "Select * from customers;";
        ArrayList<Object> params = new ArrayList<Object>();
        ResultSet rs = con.runSelect(query, params);

        try{
            while(rs.next()){
                Customer c = new Customer();
                c.setCustomerId(Integer.parseInt(rs.getString("customer_id")));
                System.out.println("Fetched Customer");
                System.out.println(c);
                this.addExistingCustomer(c);
            }
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }    
    }
}
